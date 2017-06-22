--建档人和建档单位
alter table phr_basic_info add jdr VARCHAR(25);
alter table phr_basic_info add jddw VARCHAR(255);

--刷新建档人和建档单位

--刷建档单位
update phr_basic_info a SET jddw = (SELECT CONCAT(b.address, b.whole_name) FROM hospital b where a.hospital_id = b.id) WHERE a.hospital_id is not null;

--刷建档人doctor_id不为空
update phr_basic_info a SET jdr = (SELECT realname FROM doctor b where a.doctor_id = b.id) WHERE a.doctor_id is not null;
--刷建档人doctor_id为空
update phr_basic_info a SET jdr = (SELECT username FROM admin b where a.create_user_id = b.id) WHERE a.doctor_id is null;