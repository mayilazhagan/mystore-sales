insert into product(id, name, description) values (1, 'product 1', 'product 1 desc')
insert into product(id, name, description) values (2, 'product 2', 'product 2 desc')
insert into product(id, name, description) values (3, 'product 3', 'product 3 desc')
insert into product(id, name, description) values (4, 'product 4', 'product 4 desc')
insert into product(id, name, description) values (5, 'product 5', 'product 5 desc')



insert into orders(id,order_placed_date,order_status) values (1, '2019-01-20', 'IN_PROCESS')

insert into order_lineitem(id, order_id, product_id, quantity) values (1, 1, 1, 3)
insert into order_lineitem(id, order_id, product_id, quantity) values (2, 1, 3, 7)

