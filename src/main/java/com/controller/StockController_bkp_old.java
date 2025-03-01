package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.model.Stock;

@RestController
@RequestMapping("/stocksTest")
@CrossOrigin(origins = "*")
public class StockController_bkp_old {
//
//	private static List<Stock> stocks = new ArrayList<Stock>();
//	private static Long count = 1L;
//	static {
//		try {
//			stocks.add(new Stock(count++, "AAPL", "Tech", "AAPLCUSIP"));
//			stocks.add(new Stock(count++, "TESLA", "Tech", "TESLACUSIP"));
//			stocks.add(new Stock(count++, "MSFT", "Tech", "MSFTCUSIP"));
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	@GetMapping()
//	public List<Stock> getStockList() {
//		return stocks;
//
//	}
//
//	@GetMapping("/{id}")
//	public Stock getStockById(@PathVariable Long id) {
//
//		return stocks.stream().filter(book -> book.getId().equals(id)).findFirst().orElse(null);
//	}
//
//	@PostMapping()
//	public Stock addStock(@RequestBody Stock stock) {
//
//		stock.setId(count++);
//		stocks.add(stock);
//		return stock;
//	}
//
//	@PutMapping("/{id}")
//	public Stock updateStock(@PathVariable Long id, @RequestParam Stock updatedStock) {
//
//		for (int i = 0; i < stocks.size(); i++) {
//			if (stocks.get(i).getId() == id) {
//				updatedStock.setId(id);
//				stocks.set(i, updatedStock);
//				return updatedStock;
//			}
//		}
//		return null;
//	}
//	
//	
//	
//	@DeleteMapping("/{id}")
//	public void deleteStock(@PathVariable  Long id) {
//		 stocks.removeIf( stock -> stock.getId().equals(id));
//	}

}
