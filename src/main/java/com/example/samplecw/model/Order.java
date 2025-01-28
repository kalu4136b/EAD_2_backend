package com.example.samplecw.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "`order`")
public class Order {

    @Id
    private int id;
    private String customerName;
    private String customerAddress;
    private double orderAmount;
}
