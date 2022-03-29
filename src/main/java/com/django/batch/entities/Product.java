package com.django.batch.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class Product {

    private Long id;
    private String name;
    private String prdtType;
    private String eanCode;
}
