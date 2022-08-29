package com.codecool.brightxchange.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@CrossOrigin
@RestController
@RequestMapping("product-images")
public class ProductImageController {

    public void imageUploader(@RequestParam("image") MultipartFile image) {
    }
}
