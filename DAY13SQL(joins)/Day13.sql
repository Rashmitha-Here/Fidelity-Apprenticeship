--10.Pizza Store - Update PIZZA table

CREATE TABLE pizza (
    pizza_id VARCHAR(10),
    cust_id VARCHAR(10),
    partner_id VARCHAR(10),
    pizza_name VARCHAR(15),
    pizza_type VARCHAR(15),
    order_date DATE,
    amount decimal(6,2),
    PRIMARY KEY (pizza_id),
    FOREIGN KEY (cust_id) REFERENCES customer(cust_id),
    FOREIGN KEY (partner_id) REFERENCES delivery_partner(partner_id)
);

CREATE TABLE customer ( 
    cust_id VARCHAR(10),
    cust_name VARCHAR(20),
    cust_phone BIGINT not null,
    cust_address VARCHAR(20),
    rating BIGINT not null,
    PRIMARY KEY (cust_id)
);

CREATE TABLE delivery_partner (
    partner_id VARCHAR(10),
    partner_name VARCHAR(15),
    rating BIGINT not null,
    PRIMARY KEY (partner_id)
);


INSERT INTO customer (cust_id, cust_name, cust_phone, cust_address, rating) VALUES 
('C001', 'raj', 9876543210, '123 HSR', 5),
('C002', 'sang', 8765432109, '456 Agara', 4),
('C003', 'pinky', 7654321098, '235 domlur', 3);
select * from customer;


INSERT INTO delivery_partner (partner_id, partner_name, rating)VALUES 
('P001', 'Fast Delivery', 5),
('P002', 'Quick Express', 4),
('P003', 'Swift Logistics', 3);
select * from delivery_partner;

INSERT INTO pizza (pizza_id, cust_id, partner_id, pizza_name, pizza_type, order_date, amount)
VALUES 
('PZ001', 'C001', 'P001', 'Margherita', 'Extra Large', '2024-10-01', 500),
('PZ002', 'C002', 'P002', 'Pepperoni', 'Large', '2024-10-02', 600),
('PZ003', 'C003', 'P003', 'BBQ Chicken', 'Extra Large', '2024-10-03', 700);
select * from pizza;

UPDATE pizza SET amount = amount * 0.97 WHERE pizza_type = 'Extra Large';


--11.Create table with Foreign Key constraint
CREATE TABLE salesman (
    salesman_id NUMERIC(10),
    name VARCHAR(15),
    city VARCHAR(20),
    PRIMARY KEY (salesman_id)
);


CREATE TABLE orders (
    order_no NUMERIC(10),
    purch_amt decimal(8,2),
    customer_id NUMERIC(5),
	salesman_id NUMERIC(5),
    PRIMARY KEY (order_no),
	FOREIGN KEY (salesman_id) REFERENCES salesman(salesman_id)
	);


--12 Alter Supplier table with Check Constraint
CREATE TABLE supplier (
    supplier_id NUMERIC(10),
    supplier_name varchar(40),
    Address VARCHAR(50),
	city VARCHAR(40),
	state VARCHAR(15),
	country varchar(20),
	contact VARCHAR(20),
	constraint chk_contact_length CHECK (length(contact)=10)
	);	



