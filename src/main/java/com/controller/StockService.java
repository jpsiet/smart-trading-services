package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.StockRepository;
import com.model.StockEntity;

@Service
public class StockService {

	@Autowired
	private StockRepository stockRepository;

	// Add a new stock
	public StockEntity addStock(StockEntity stock) {
		return stockRepository.save(stock);
	}

	// Get a list of all stocks
	public List<StockEntity> getAllStocks() {
		return stockRepository.findAll();
	}

	// Get stock by Cusip
	public Optional<StockEntity> getStockByCusip(String cusip) {
		return stockRepository.findById(cusip);
	}

	// Delete stock by Cusip
	public void deleteStock(String cusip) {
		stockRepository.deleteById(cusip);
	}
}
