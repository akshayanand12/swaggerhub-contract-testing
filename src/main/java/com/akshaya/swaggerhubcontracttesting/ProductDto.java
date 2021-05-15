package com.akshaya.swaggerhubcontracttesting;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@Getter
@AllArgsConstructor
public class ProductDto {
    private long id;
    private String name;
    private List<String> colors;
    private int cost;
}
