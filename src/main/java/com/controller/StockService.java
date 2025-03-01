package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.StockRepository;
import com.model.Stock;

import java.util.List;
import java.util.Optional;

@Service
public class StockService {

    @Autowired
    private StockRepository stockRepository;

    // Add a new stock
    public Stock addStock(Stock stock) {
        return stockRepository.save(stock);
    }

    // Get a list of all stocks
    public List<Stock> getAllStocks() {
        return stockRepository.findAll();
    }

    // Get stock by Cusip
    public Optional<Stock> getStockByCusip(String cusip) {
        return stockRepository.findById(cusip);
    }

    // Delete stock by Cusip
    public void deleteStock(String cusip) {
        stockRepository.deleteById(cusip);
    }
}
