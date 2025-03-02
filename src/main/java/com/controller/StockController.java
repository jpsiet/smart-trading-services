package com.controller;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.StocksApi;
import com.dataloader.ModelMapperUtil;
import com.model.Stock;
import com.model.StockEntity;

@RestController
@RequestMapping("/stocks")
@CrossOrigin(origins = "*")
public class StockController  implements StocksApi {

    @Autowired
    private StockService stockService;

    // Get all stocks
    @SuppressWarnings("unchecked")
	@GetMapping
    public ResponseEntity<List<Stock>> getAllStocks() {
    
    	
        List<StockEntity> stocksEnt = stockService.getAllStocks();
        
        List<Stock> stocks =  ModelMapperUtil.mapList(stocksEnt, Stock.class);
         
        return  (ResponseEntity<List<Stock>>) new ResponseEntity(stocks, HttpStatus.OK);
    }

    // Get stock by Cusip
    @GetMapping("/{cusip}")
    public Optional<StockEntity> getStock(@PathVariable String cusip) {
        return stockService.getStockByCusip(cusip);
    }

    // Add a new stock
    @PostMapping
    public ResponseEntity addStock(@RequestBody Stock stock) {
    	ModelMapper modelMapper = new ModelMapper();
    	StockEntity stockEnt =  modelMapper.map(stock, StockEntity.class);
    	 stockService.addStock(stockEnt);
        return (ResponseEntity<Stock>) new ResponseEntity<Stock>(stock,HttpStatus.OK);
    }

    // Delete stock by Cusip
    @DeleteMapping("/{cusip}")
    public void deleteStock(@PathVariable String cusip) {
        stockService.deleteStock(cusip);
    }
}
