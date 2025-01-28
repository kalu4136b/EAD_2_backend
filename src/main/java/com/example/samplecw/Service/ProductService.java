package com.example.samplecw.Service;


import com.example.samplecw.Repository.ProductRepository;
import com.example.samplecw.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    // Get all products
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Get product by ID
    public Optional<Product> getProductById(String id) {
        return productRepository.findById(id);
    }

    // Add new product
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    // Update existing product
    public Product updateProduct(String id, Product product) {
        if (productRepository.existsById(id)) {
            product.setId(id);
            return productRepository.save(product);
        }
        return null;
    }

    // Delete product
    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }
}
