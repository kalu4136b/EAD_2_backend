package com.example.samplecw.Repository;

import com.example.samplecw.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface orderRepository extends JpaRepository<Order , Long> {


}
