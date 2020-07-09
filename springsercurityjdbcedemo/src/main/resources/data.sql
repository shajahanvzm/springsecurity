insert into users(username,password,enabled) value ('user','user',true);
insert into users(username,password,enabled) value ('admin','admin',true);
insert into authorities(username,authorit) value ('user','ROLE_USER');
insert into authorities(username,authorit) value ('admin','ROLE_ADMIN');
