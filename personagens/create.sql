create table tb_character (id int8 generated by default as identity, country varchar(255), image_uri varchar(255), name varchar(255), power int4, team varchar(255), primary key (id));
INSERT INTO tb_character (name, power, country, team, image_Uri) VALUES ('Baitman', 6, 'BR', 'Marvio', 'ttps://.githubusercontent');
INSERT INTO tb_character (name, power, country, team, image_Uri) VALUES ('Hulk', 8, 'EUA', 'Marvio', 'ttps://.githubusercontent');
INSERT INTO tb_character (name, power, country, team, image_Uri) VALUES ('Zé Gotinha', 4, 'BR', 'Marvio', 'ttps://.githubusercontent');
INSERT INTO tb_character (name, power, country, team, image_Uri) VALUES ('Saci', 5, 'BR', 'Marvio', 'ttps://.githubusercontent');