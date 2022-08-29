package com.codecool.brightxchange.model.categories;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Builder
@Entity(name = "Category")
@Table(name = "category",
    uniqueConstraints = {
        @UniqueConstraint(name = "category_name_unique", columnNames = "name")
    }
)
public class Category {
    @Id
    @SequenceGenerator(
            name = "category_sequence",
            sequenceName = "category_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "category_sequence"
    )
    private Long id;

    @Column(
            name = "name",
            columnDefinition = "TEXT"
    )
    private String name;

    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Category(String name) {
        this.name = name;
    }

    private String getTempName(){
        return name.toLowerCase().replace(" ", "-");
    }

    public String getImageUrl(){
        return String.format("https://brightxchangeprojectbucket.s3.eu-central-1.amazonaws.com/cat/%s.jpg", getTempName());
    }

    public String getUrl(){
        return String.format("/%s",getTempName());
    }
}
