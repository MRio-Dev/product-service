package com.service.product_service.service;

import com.service.product_service.dto.ProductRequest;
import com.service.product_service.dto.ProductResponse;
import com.service.product_service.dto.ProductUpdateRequest;

import java.util.List;

public interface ProductService {

    List<ProductResponse> getAllProduct();

    ProductResponse getProductById(Integer id);

    void addProduct(ProductRequest productRequest);

    ProductResponse deleteProduct(Integer id);

    ProductResponse updateProduct(ProductUpdateRequest product);

}
