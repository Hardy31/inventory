﻿CREATE TABLE kabinet (
    id       INTEGER PRIMARY KEY AUTOINCREMENT,
    name     STRING  UNIQUE ON CONFLICT IGNORE,
    id_otdel INTEGER REFERENCES otdel (id)
);


CREATE TABLE komp (
    id         INTEGER PRIMARY KEY AUTOINCREMENT,
    name       STRING  UNIQUE ON CONFLICT IGNORE,
    id_kabinet INTEGER REFERENCES kabinet (id)
);


CREATE TABLE komplect (
    id      INTEGER PRIMARY KEY AUTOINCREMENT,
    name    STRING  UNIQUE ON CONFLICT IGNORE,
    id_komp INTEGER
);


CREATE TABLE organizacia (
    name STRING
);

CREATE TABLE otdel (
    id   INTEGER PRIMARY KEY AUTOINCREMENT,
    name STRING  CONSTRAINT [Слвпадение названий] UNIQUE ON CONFLICT IGNORE
);

