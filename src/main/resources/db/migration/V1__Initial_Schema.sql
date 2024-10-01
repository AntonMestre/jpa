create table store (id binary(16) not null, primary key (id)) engine=InnoDB;
create table surf (initial_price float(53), id binary(16) not null, store_id binary(16), name varchar(255), primary key (id)) engine=InnoDB;
alter table surf add constraint FKbqp2n9l5io1f42fmu191lkie2 foreign key (store_id) references store (id);
