CREATE TABLE customers (
    id INT AUTO_INCREMENT NOT NULL,
    registered DATE NOT NULL,
    email_address VARCHAR(255) UNIQUE NOT NULL,
    title VARCHAR(5) NOT NULL,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    address_line_1 VARCHAR(255) NOT NULL,
    address_line_2 VARCHAR(255) DEFAULT NULL,
    city VARCHAR(255) DEFAULT NULL,
    postcode VARCHAR(10) NOT NULL,
    phone_number VARCHAR(20) DEFAULT NULL,
    PRIMARY KEY (id)
);