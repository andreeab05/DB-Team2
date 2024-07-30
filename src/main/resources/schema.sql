CREATE TABLE Customers (
    customer_id INT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    nationality VARCHAR(100),
    networth INT
);


CREATE TABLE Stocks (
    stock_id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    market_place VARCHAR(50),
    price INT,
    growth_rate INT
);


CREATE TABLE Customer_Stock (
    customer_id INT,
    stock_id INT,
    FOREIGN KEY (customer_id) REFERENCES Customers(customer_id),
    FOREIGN KEY (stock_id) REFERENCES Stocks(stock_id)
);
