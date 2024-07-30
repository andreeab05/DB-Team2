
-- Insert random data into Customers
INSERT INTO Customers (customer_id, name, nationality, networth)
VALUES
    (1, 'Moe', 'SYR', 100000),
    (2, 'Felix', 'DE', 75000),
    (3, 'Andreea', 'RO', 65000),
    (4, 'Chandana', 'IND', 175000),
    (5, 'Diana', 'JP', 95000)

-- Insert random data into Stocks
INSERT INTO Stocks (stock_id, name, market_place, price, growth_rate)
VALUES
    (101, 'MSFT', 'NASDAQ', 300, 5),
    (102, 'GOOG', 'NASDAQ', 2500, -2),
    (103, 'APPL', 'NASDAQ', 2500, -1),
    (104, 'NVDA', 'NASDAQ', 2500, +2),
    (105, 'META', 'NASDAQ', 2500, +5)

-- Insert random data into Customer_Stock
INSERT INTO Customer_Stock (customer_id, stock_id)
VALUES
    (1, 101),
    (1, 102),
    (2, 101),
    (2, 103),
    (3, 102),
    (3, 103),
    (4, 103),
    (4, 104),
    (4, 105),
    (5, 102),
    (5, 105)
;
