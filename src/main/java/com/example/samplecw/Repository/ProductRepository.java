package com.example.samplecw.Repository;


import com.example.samplecw.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
    // Add custom query methods if needed
}