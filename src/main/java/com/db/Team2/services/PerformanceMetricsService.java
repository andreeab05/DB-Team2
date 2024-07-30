package com.db.Team2.services;

import com.db.Team2.models.Stock;
import com.db.Team2.repositories.StockRepository;

public class PerformanceMetricsService {
    @Autowired
    private StockRepository stockRepository;
    public double getGrowthRate(int stockId){
        Stock stock = stockRepository.findById(stockId).get();
        return stock.getGrowth_rate();
    }

}
