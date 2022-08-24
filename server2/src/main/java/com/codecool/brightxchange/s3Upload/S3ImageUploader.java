package com.codecool.brightxchange.s3Upload;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.codecool.brightxchange.model.CategoryImage;
import com.codecool.brightxchange.model.ProductImage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@Service
public class S3ImageUploader {
    private final AmazonS3 s3Client;
    private final String s3KeyId;
    private final String s3AccessKey;
    private final String s3BucketName;
    private final List<File> productImages;
    private final String s3ImageUrl;
    private File categoryImage;

    public S3ImageUploader(@Value("${s3_id}") String id, @Value("${s3_key}") String key, @Value("${s3_name}") String name, @Value("${s3_url_prod}") String ImageUrl) {
        s3KeyId = id;
        s3AccessKey = key;
        s3BucketName = name;
        s3ImageUrl = ImageUrl;
        productImages = new ArrayList<>();

        AWSCredentials credentials = new BasicAWSCredentials(s3KeyId, s3AccessKey);
        AWSCredentialsProvider provider = new AWSStaticCredentialsProvider(credentials);

        s3Client = AmazonS3Client.builder().withRegion(Regions.EU_CENTRAL_1).withCredentials(provider).build();

    }

    public List<ProductImage> uploadProductImages(String fileName) {
        List<ProductImage> images = new ArrayList<>();
        for (int i = 0; i < productImages.size(); i++) {
            String imageName = String.format("%s_%s.jpg", fileName, i);

            PutObjectRequest request = new PutObjectRequest(s3BucketName, imageName, productImages.get(i));
            s3Client.putObject(request);

            productImages.get(i).delete();
            images.add(new ProductImage(s3ImageUrl + imageName));
        }

        productImages.clear();
        return images;
    }

    public CategoryImage uploadCategoryImage(String fileName) {
        String imageName = String.format(fileName + ".jpg");
        PutObjectRequest request = new PutObjectRequest(s3BucketName, imageName, categoryImage);
        s3Client.putObject(request);
        categoryImage.delete();
        return new CategoryImage(s3ImageUrl + imageName);
    }


    public void saveCategoryImage(MultipartFile image) {
        File file1 = new File(String.format("img%s.jpg", productImages.size()));
        try {
            FileOutputStream out = new FileOutputStream(file1);
            out.write(image.getInputStream().readAllBytes());
            file1.createNewFile();
            System.out.println(file1.getAbsolutePath());
            categoryImage = file1;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void saveProductImages(MultipartFile image) {
        File file1 = new File(String.format("img%s.jpg", productImages.size()));
        try {
            FileOutputStream out = new FileOutputStream(file1);
            out.write(image.getInputStream().readAllBytes());
            file1.createNewFile();
            System.out.println(file1.getAbsolutePath());
            productImages.add(file1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(productImages);
    }

    public void clearImages() {
        categoryImage = null;
        productImages.clear();
    }
}
