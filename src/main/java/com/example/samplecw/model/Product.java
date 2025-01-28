package com.example.samplecw.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Product {

    @Id
    private String Id;
    private String name;
    private String description;
    private Double price;
    private Integer stockQuantity;

}
