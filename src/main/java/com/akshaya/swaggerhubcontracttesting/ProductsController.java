package com.akshaya.swaggerhubcontracttesting;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ProductsController {
    @GetMapping(value = "/products")
    public ResponseEntity<List<ProductDto>> getProductList() {
        List<ProductDto> productDtoList = new ArrayList<>();
        productDtoList.add(new ProductDto(1, "shirt", Arrays.asList("red", "green"), 50));
        productDtoList.add(new ProductDto(2, "pants", Arrays.asList("blue", "black"), 100));
        productDtoList.add(new ProductDto(3, "shoes", Arrays.asList("white", "blue"), 80));

        return ResponseEntity.
                status(HttpStatus.OK).
                contentType(MediaType.APPLICATION_JSON).
                body(productDtoList);
    }
}
