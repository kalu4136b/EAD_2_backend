package com.example.samplecw.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "`product`")

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String Id;
    private String name;
    private String description;
    private Double price;
    private Integer stockQuantity;
    @Column(length = 1000)
    private String imageUrl;

}
