package com.javamicroservices.productservice.controller;

import com.javamicroservices.productservice.dto.ProductRequest;
import com.javamicroservices.productservice.dto.ProductResponse;
import com.javamicroservices.productservice.model.Product;
import com.javamicroservices.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest){
        productService.createproduct((productRequest));
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts(){
        return productService.getAllProducts();
    }
}
