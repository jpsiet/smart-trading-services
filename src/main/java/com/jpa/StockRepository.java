package com.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.StockEntity;

public interface StockRepository extends JpaRepository<StockEntity, String> {
    // You can add custom queries if needed
}