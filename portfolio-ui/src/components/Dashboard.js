import React from 'react';
import StockImage from '../assets/StockImage.jpg';

function Dashboard() {

    // Sample data (replace with actual data from your backend via API calls.)
    const stocks = [
        { name: 'Stock A', amount: 100, cost: 1200, growth: 0.15 },
        { name: 'Stock B', amount: 200, cost: 1800, growth: -0.05 }
    ];

    const assetAllocations = [
        { market: 'Market 1', allocation: 40 },
        { market: 'Market 2', allocation: 40 },
        { market: 'Market 4', allocation: 20 },
    ];

    const performanceMetrics = [
        { stock: 'Stock A', metric: 'ROI: 12%' },
        { stock: 'Stock B', metric: 'Volatility: 8%' },
    ];

return (
        <div className="container mt-4">
            <div className="row">
                <div className="col-md-12">
                    <div className="section-box">
                        <h3>Portfolio Position</h3>
                        <div className="scrollable-box d-flex">
                            {stocks.map((stock) => (
                                <div key={stock.name} className="stock-item">
                                    <div className="stock-box p-3">
                                        <img src={StockImage} alt={stock.name} />
                                        <p>
                                            {`Amount: ${stock.amount}`} <br /> {`Cost: $${stock.cost}`} <br /> {`Growth: ${stock.growth * 100}%`}
                                        </p>
                                    </div>
                                </div>
                            ))}
                        </div>
                    </div>
                </div>
            </div>
            <div className="row mt-4">
                <div className="col-md-12">
                    <div className="section-box">
                        <h3>Asset Allocation</h3>
                        <div className="scrollable-box d-flex">
                            {assetAllocations.map((allocation) => (
                                <div key={allocation.market} className="allocation-item">
                                    <div className="allocation-box p-3">
                                        {`${allocation.market} - % Allocation: ${allocation.allocation}`}
                                    </div>
                                </div>
                            ))}
                        </div>
                    </div>
                </div>
            </div>
            <div className="row mt-4">
                <div className="col-md-12">
                    <div className="section-box">
                        <h3>Performance Metrics</h3>
                        <div className="scrollable-box d-flex">
                            {performanceMetrics.map((metric) => (
                                <div key={metric.stock} className="metric-item">
                                    <div className="metric-box p-3">
                                        <img src={StockImage} alt={metric.stock} />
                                        <p>{metric.metric}</p>
                                    </div>
                                </div>
                            ))}
                        </div>
                    </div>
                </div>
            </div>
        </div>
    );
}

export default Dashboard;