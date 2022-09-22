package com.codecool.brightxchange.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class SimpleFilter {
    private String searchText;
    private Integer minPrice;
    private Integer maxPrice;
    private List<String> producers;
    private List<String> categories;
}
