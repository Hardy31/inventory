

--INSERT INTO public.tmc(
--    code, description, location,tag)
--VALUES ('1380338', '5881 фон.рир.проекции', 'ТВ студия', 'баланс'),
--       ('26627', 'DVD- рекордер Sony RDR-GX310', 'Склад', 'баланс'),
--       ('1380432', 'DVD-рекордер', 'Склад', 'баланс'),
--       ('1380331',	'FM-Процессор',	'ТРПЦ',	'баланс');

--


----
 DROP TABLE IF EXISTS tmc;
--
-- CREATE TABLE tmc AS SELECT * FROM CSVREAD('resources/dataCSV01.csv');
-- CREATE TABLE tmc AS SELECT * FROM CSVREAD('C:\Users\Administrator\IdeaProjects\inventory\src\main\resources\DataCSUU.csv',null,'fieldSeparator=;');

-- CREATE TABLE tmc AS SELECT * FROM CSVREAD('C:/Users/Administrator/IdeaProjects/inventory/src/main/resources/dataCSVm.csv',null,'fieldSeparator=;');
-- CREATE TABLE tmc AS SELECT * FROM CSVREAD('C:/Users/Administrator/IdeaProjects/inventory/src/main/resources/dataCSVt.csv',null,'fieldSeparator=;');
-- CREATE TABLE tmc AS SELECT * FROM CSVREAD('C:/Users/Administrator/IdeaProjects/inventory/src/main/resources/dataCSVZ.csv',null,'fieldSeparator=;');
-- CREATE TABLE tmc AS SELECT * FROM CSVREAD('C:/Users/Administrator/IdeaProjects/inventory/src/main/resources/TabUTF8.txt',null,'fieldSeparator=\\t');

-- CREATE TABLE tmc AS SELECT * FROM CSVREAD('C:/Users/Administrator/IdeaProjects/inventory/src/main/resources/encoded-111.csv',null,'fieldSeparator=;');
 CREATE TABLE tmc AS SELECT * FROM CSVREAD('C:/Users/Administrator/IdeaProjects/inventory/src/main/resources/encoded-111.csv',null,'fieldSeparator=;');



--ALTER TABLE tmc MODIFY COLUMN id INT auto_increment;