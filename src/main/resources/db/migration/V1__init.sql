-- auto-generated definition
create table airplanes
(
	id bigint not null auto_increment
		primary key,
	manufacturer varchar(100) null,
	engine_count int null,
	constraint id
		unique (id)
)
;
