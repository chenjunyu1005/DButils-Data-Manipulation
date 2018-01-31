CREATE TABLE record(
id INT PRIMARY KEY AUTO_INCREMENT,
flname VARCHARACTER(200),
money DOUBLE,
account VARCHAR(100),
createtime DATE,
description VARCHAR(1000)
);

INSERT  INTO record(id,flname,money,account,createtime,description) VALUES (1,'FoodExpense',247,'Chase','2016-03-02','familiyReuion');
INSERT  INTO record(id,flname,money,account,createtime,description) VALUES (2,'Salary',12345,'Cash','2016-03-15','RaiseSalary');
INSERT  INTO record(id,flname,money,account,createtime,description) VALUES (3,'ClothExpense',1998,'Cash','2016-04-02','BuyCloth');
INSERT  INTO record(id,flname,money,account,createtime,description) VALUES (4,'FoodExpense',325,'Cash','2016-06-18','party');
INSERT  INTO record(id,flname,money,account,createtime,description) VALUES (5,'StockIncome',8000,'CityBank','2016-10-28','stockPrice go up');
INSERT  INTO record(id,flname,money,account,createtime,description) VALUES (6,'StockIncome',5000,'CityBank','2016-10-28','stockPrice go up');
INSERT  INTO record(id,flname,money,account,createtime,description) VALUES (7,'Salary',5000,'Chase','2016-10-28','RaiseSalary');
INSERT  INTO record(id,flname,money,account,createtime,description) VALUES (8,'GiftExpense',5000,'Cash','2016-10-28','friend get marry');
INSERT  INTO record(id,flname,money,account,createtime,description) VALUES (9,'OtherExpense',1560,'Cash','2016-10-29','lost money');
INSERT  INTO record(id,flname,money,account,createtime,description) VALUES (10,'TrafficExpense',2300,'Chase','2016-10-29','some others');
INSERT  INTO record(id,flname,money,account,createtime,description) VALUES (11,'FoodExpense',1000,'CityBank','2016-10-29','supermarket shopping');
INSERT  INTO record(id,flname,money,account,createtime,description) VALUES (12,'Salary',1000,'Cash','2016-10-30','RaiseSalary');
INSERT  INTO record(id,flname,money,account,createtime,description) VALUES (13,'TrafficExpense',2000,'Cash','2016-10-30','buying airline Ticket');
INSERT  INTO record(id,flname,money,account,createtime,description) VALUES (14,'Salary',5000,'Cash','2016-10-30','Promotion');
select *from record