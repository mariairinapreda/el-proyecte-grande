package com.codecool.brightxchange;

import com.codecool.brightxchange.model.categories.Category;
import com.codecool.brightxchange.repositories.categories.CategoryDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BrightXchangeApplication {

    public static void main(String[] args) {
        SpringApplication.run(BrightXchangeApplication.class, args);
    }

    @Bean
    public CommandLineRunner createCategories(CategoryDAO repository) {
        return (args) ->{
            if(repository.findAll().size()<12 ) {
                repository.save(new Category("Carcase"));
                repository.save(new Category("Coolere"));
                repository.save(new Category("Desktop-uri"));
                repository.save(new Category("Hard-disk-uri"));
                repository.save(new Category("Laptopuri"));
                repository.save(new Category("Memorii"));
                repository.save(new Category("Placi de baza"));
                repository.save(new Category("Placi video"));
                repository.save(new Category("Procesoare"));
                repository.save(new Category("SSD-uri"));
                repository.save(new Category("Surse"));
                repository.save(new Category("Ventilatoare"));
                repository.findAll();
            }
        };
    }

}
