package com.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Stock;

public interface StockRepository extends JpaRepository<Stock, String> {
    // You can add custom queries if needed
}