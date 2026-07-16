package com.service.product_service.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductResponse {
    private Integer id;
    private String name;
    private String price;
    private String description;
}
