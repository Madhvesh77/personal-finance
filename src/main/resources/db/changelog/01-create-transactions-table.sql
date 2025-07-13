CREATE TABLE transactions (
  id INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
  transaction_type VARCHAR(255) NOT NULL,
  transaction_amount INT NOT NULL,
  transaction_date DATE NOT NULL
);