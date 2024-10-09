Create table customers(customer_id varchar(10) Primary Key, 
customer_name varchar(20) not null,
address varchar(20) not null,
phone_no BIGINT not null,
email_id varchar(20) not null
);

insert into customers (customer_id, customer_name, address, phone_no, email_id) VALUES
('CUST1001', 'THOMAS', 'KOCHI', 9856325486, 'thomas@gmail.com'),
('CUST1002', 'CHARLES', 'ALLEPY', 9856367486, 'charles@gmail.com'),
('CUST1003', 'SUDHAKAR', 'KOCHI', 9856323869, 'sudhakar@gmail.com'),
('CUST1004', 'JAGADISH', 'ERNAKULAM', 9856326666, 'jagadish@gmail.com'),
('CUST1005', 'ALBERT', 'ALLEPY', 9856328659, 'albert@gmail.com'),
('CUST1006', 'ASHWIN DAS', 'KANNUR', 9856325659, 'ashwin@gmail.com');

select*from customers;

create table delivery_partners (partner_id VARCHAR(10) PRIMARY KEY,
    partner_name VARCHAR(20) NOT NULL,
    phone_no BIGINT NOT NULL,
    rating INT
);

insert into delivery_partners (partner_id, partner_name, phone_no, rating) VALUES
('PART1001', 'Rakesh', 9876543210, 4),
('PART1002', 'Divya', 9876543220, 5),
('PART1003', 'Sumith', 9876543230, 3),
('PART1004', 'jack', 9876543240, 2),
('PART1005', 'chaitra', 9876543250, 5);

select*from delivery_partners;

create table hotel_details (
    hotel_id VARCHAR(10) PRIMARY KEY,
    hotel_name VARCHAR(20) NOT NULL,
    hotel_type VARCHAR(20) NOT NULL,
    rating INT
);

insert into hotel_details (hotel_id, hotel_name, hotel_type, rating) VALUES
('HOTEL1001', 'UDUPI HOTEL', 'VEG', 4),
('HOTEL1002', 'McDonalds', 'NON-VEG', 5),
('HOTEL1003', 'KFC', 'NON-VEG', 3),
('HOTEL1004', 'Pizza Hut', 'VEG', 4),
('HOTEL1005', 'Dominos', 'VEG', 3);

select*from hotel_details;

create table orders (
    order_id VARCHAR(10) PRIMARY KEY,
    customer_id VARCHAR(10) NOT NULL,
    hotel_id VARCHAR(10) NOT NULL,
    partner_id VARCHAR(10) NOT NULL,
    order_date DATE,
    order_amount INT,
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id),
    FOREIGN KEY (hotel_id) REFERENCES hotel_details(hotel_id),
    FOREIGN KEY (partner_id) REFERENCES delivery_partners(partner_id)
);

insert into orders (order_id, customer_id, hotel_id, partner_id, order_date, order_amount) VALUES
('ORD1001', 'CUST1001', 'HOTEL1001', 'PART1001', '2024-11-11', 500),
('ORD1002', 'CUST1002', 'HOTEL1002', 'PART1002', '2024-11-12', 800),
('ORD1003', 'CUST1003', 'HOTEL1003', 'PART1003', '2024-11-13', 600),
('ORD1004', 'CUST1004', 'HOTEL1004', 'PART1004', '2024-11-14', 700),
('ORD1005', 'CUST1005', 'HOTEL1005', 'PART1005', '2024-11-15', 450);

select*from orders;

---Delivery Partner details based on rating
select partner_id, partner_name, phone_no from delivery_partners where rating between 3 and 5
order by partner_id;

--Hunger eats ,update table
update customers set phone_no = '9876543210' where customer_id = 'CUST1004';

select*from customers;

 --Customers having gmail id
select customer_id, customer_name, address, phone_no from customers where email_id LIKE '%@gmail.com'
order by customer_id;

select*from customers;

--Hunger eats - change datatype
alter table customers
alter column customer_id type int using customer_id::integer;

--Hunger eats - Change the field name
alter table hotel_details rename column rating to hotel_rating;

select*from hotel_details;

--Hotel_info
select CONCAT(hotel_name, ' is a ', hotel_type, ' hotel') as HOTEL_INFO
from hotel_details order by hotel_name desc;

--where hotel_id='HOTEL1001'

--Hotels that took order more than five times
select h.hotel_id, h.hotel_name, count(o.order_id) as NO_OF_ORDERS
from hotel_details h
join orders o on h.hotel_id = o.hotel_id
group by h.hotel_id, h.hotel_name
having count(o.order_id) >= 5
order by h.hotel_id asc;

--Hotels not taken orders in a specific month
select h.hotel_id, h.hotel_name, h.hotel_type
from hotel_details h
left join orders o on h.hotel_id = o.hotel_id and o.order_date between '2024-11-11' and '2024-11-15'
where o.order_id is null
order by h.hotel_id asc;

--Order details
select o.order_id, c.customer_name, h.hotel_name, o.order_amount
from orders o
join customers c on o.customer_id = c.customer_id
join hotel_details h on o.hotel_id = h.hotel_id
order by o.order_id asc;



CREATE OR REPLACE FUNCTION insert_customer(
    p_customer_id VARCHAR,
    p_customer_name VARCHAR,
    p_address VARCHAR,
    p_phone_no BIGINT,
    p_email_id VARCHAR
) RETURNS VOID AS 
$$
BEGIN
    INSERT INTO customers (customer_id, customer_name, address, phone_no, email_id)
    VALUES (p_customer_id, p_customer_name, p_address, p_phone_no, p_email_id);
END;
$$ LANGUAGE plpgsql;


CREATE OR REPLACE FUNCTION update_customer_phone(
    p_customer_id VARCHAR,
    p_new_phone_no BIGINT
) RETURNS VOID AS 
$$
BEGIN
    UPDATE customers
    SET phone_no = p_new_phone_no
    WHERE customer_id = p_customer_id;
END;
$$ LANGUAGE plpgsql;

select insert_customer('CUST1007','NEW CUST', 'NEWCITY',9876543210,'newcust@gmail.com');
select update_customer_phone('CUST1004',9867543201);

