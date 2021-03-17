drop table person;
create table person(
id int primary key,
person_name text,
person_lastName text
--parents_id int references parents(parents_id),
--siblings_id int references siblings(siblings_id),
--children_id int  references children(children_id),
--granparents_id int references grandparents(granparents_id)
);

drop table parents;
create table parents(
parents_id int primary key,
parents_momName text,
parents_momLastName text,
parents_dadName text,
parents_dadLastName text,
id int references person(id)
);
drop table siblings;
create table siblings(
siblings_id int primary key,
sibling_name text,
sibling_lastName text,
id int references person(id)
);
drop table children;
create table children(
children_id int primary key,
children_name text,
children_lastName text,
id int references person(id)
);
drop table grandparents;
create table grandparents(
granparents_id int primary key,
grantparents_name text,
grantparents_lastName text,
id int references person(id)
);


--insert into person values(1,'person','Bob',1,1,1,1);
insert into person values(1,'person','Bob');
insert  into grandparents values(1,'Joshuau','Bob',1);

insert  into siblings values(1,'James','Bob',1);
insert  into siblings values(2,'Jamie','Bob',1);
insert  into siblings values(3,'Jack','Bob',1);
insert  into siblings values(4,'Julie','Bob',1);

insert  into children values(1,'Jim','Bob',1);
insert  into children values(2,'Jess','Bob',1);
insert  into children values(3,'John','Bob',1);
insert  into children values(4,'Jane','Bob',1);

insert  into parents values(3,'Joe','Bob','Jim','Bob',1);
--insert  into parents values(2,'Jim','Bob',1);

select * from person inner join parents on (person.id =parents.id) 
						inner join children on(person.id =children.id) 
						inner join siblings s on(person.id=s.id)
					 inner join children c on(person.id=c.id)
					 inner join parents p on (person.id=p.id);
					
select * from siblings s where s.sibling_lastname  like 'Bob';

select * from parents left join person on (parents.id =person.id );

					




