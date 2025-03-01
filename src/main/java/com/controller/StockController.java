package com.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.model.Stock;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/stocks")
@CrossOrigin(origins = "*")
public class StockController {

    @Autowired
    private StockService stockService;

    // Get all stocks
    @GetMapping
    public List<Stock> getAllStocks() {
        return stockService.getAllStocks();
    }

    // Get stock by Cusip
    @GetMapping("/{cusip}")
    public Optional<Stock> getStock(@PathVariable String cusip) {
        return stockService.getStockByCusip(cusip);
    }

    // Add a new stock
    @PostMapping
    public Stock addStock(@RequestBody Stock stock) {
        return stockService.addStock(stock);
    }

    // Delete stock by Cusip
    @DeleteMapping("/{cusip}")
    public void deleteStock(@PathVariable String cusip) {
        stockService.deleteStock(cusip);
    }
}
