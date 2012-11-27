create table pojo (
	id int8 not null,
    namecol varchar(255) unique
);


create sequence hibernate_sequence;



--inserts

INSERT INTO pojo (id, namecol) VALUES (1, 'first');