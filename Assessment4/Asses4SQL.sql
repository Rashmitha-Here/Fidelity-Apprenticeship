create table worker(worker_id int primary key, 
first_name varchar(50),
last_name varchar(50),
salary decimal(10,2),
joining_date date,
department varchar(50));

insert into worker(worker_id,first_name ,last_name ,salary ,joining_date ,department) values
(1,'rashmitha','M',50000.00,'2024-01-20','Developer'),
(2,'rajesh','gowda',60000.00,'2024-09-16','HR'),
(3,'preethi','shing',55000.00,'2023-08-10','Accountant'),
(4,'Prajjwal','Mishra',58000.00,'2024-09-18','HR'),
(5,'pooja','shetty',57000.00,'2024-10-09','Developer'),
(6,'sheshadri','shing',66000.00,'2024-07-15','Manager');

select*from worker;

create table title(worker_ref_ID int,
worker_title varchar(50),
Affected_from date,
Foreign key (worker_ref_ID) references worker(worker_ID)
);

insert into title(worker_ref_ID,worker_title,Affected_from) values
(1,'HR','2024-01-20'),
(2,'Accountant','2023-09-16'),
(3,'Manager','2024-08-10'),
(4,'Developer','2023-07-18'),
(5,'HR','2024-10-01'),
(6,'Developer','2024-06-15');

select*from title;

create table bonus(worker_ref_ID int,
Bonus_amount decimal(10,2),
Bonus_date date,
Foreign key (worker_ref_ID) references worker(worker_ID)
);

insert into bonus(worker_ref_ID,Bonus_amount, Bonus_date) values
(1,5000.00,'2024-02-20'),
(2,3000.00,'2022-07-17'),
(3,4000.00,'2020-08-10'),
(4,3000.00,'2021-01-18'),
(5,2000.00,'2023-10-01'),
(6,3000.00,'2022-06-15');

select*from bonus;

---1.
select W.first_name,W.salary,T.worker_title from worker W
join title T on W.worker_ID=T.worker_ref_ID;

--2
create or replace function get_worker_count_by_nth_highest_salary(n INT)
returns Integer AS 
$$
declare
	nth_highest_salary DECIMAL;
	worker_count Integer;
Begin
	select Distinct salary
	into nth_highest_salary
	from worker
	order by salary desc
	limit 1 offset n-1;

	select count(*)
	into worker_count
	from worker
	where salary=nth_highest_salary;

	return worker_count;
end;
$$
language plpgsql;

select get_worker_count_by_nth_highest_salary(4);
select get_worker_count_by_nth_highest_salary(2);