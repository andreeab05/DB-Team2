package com.db.Team2.controllers;

import com.db.Team2.services.PerformanceMetricsService;

@RestController("/PerformanceMetrics")
public class PerformanceMetricsController {
    @Autowired
    private PerformanceMetricsService performanceMetricsService;

    @GetMapping("/stocks/{id}/growthRate")
    public double getStockGrowthRate(@PathParameter("id") int id){
        return performanceMetricsService.getGrowthRate(id);
    }
}
