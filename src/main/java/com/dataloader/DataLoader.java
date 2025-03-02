package com.dataloader;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpa.StockRepository;
import com.model.StockEntity;

@Component
public class DataLoader implements CommandLineRunner {

    private final StockRepository stockRepository;

    public DataLoader(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Adding some sample data
//        stockRepository.save(new StockEntity(1L,"AAPL", "Apple Inc.", "Technology",new BigDecimal("200.45"),200000l,"good stock"));
//        stockRepository.save(new StockEntity(2l,"MSFT", "Microsoft Corp.", "Technology",new BigDecimal("400.31"),300000l,"Perfect stock"));
//        stockRepository.save(new StockEntity(3l,"GOOGL", "Alphabet Inc.", "Technology",new BigDecimal("190"),250000l,"good stock"));
//        stockRepository.save(new StockEntity(4l,"TSLA", "Tesla Inc.", "Automotive",new BigDecimal("390"),100000l,"Awosome stock"));
//        stockRepository.save(new StockEntity(5l,"AMZN", "Amazon.com Inc.", "Retail",new BigDecimal("1080"),200000l,"Perfect one"));
    }
}
