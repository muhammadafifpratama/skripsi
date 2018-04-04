--
-- File generated with SQLiteStudio v3.1.1 on Sel Mei 23 12:19:00 2017
--
-- Text encoding used: System
--
PRAGMA foreign_keys = off;
BEGIN TRANSACTION;

-- Table: data
CREATE TABLE data (alternatif VARCHAR, harga DOUBLE, batere DOUBLE, ram DOUBLE, storage DOUBLE, screenres DOUBLE, camerares DOUBLE);
INSERT INTO data (alternatif, harga, batere, ram, storage, screenres, camerares) VALUES ('hp1', 300, 3000, 3, 32, 424, 16);
INSERT INTO data (alternatif, harga, batere, ram, storage, screenres, camerares) VALUES ('hp2', 1600, 4100, 2, 16, 296, 13);
INSERT INTO data (alternatif, harga, batere, ram, storage, screenres, camerares) VALUES ('hp3', 54500, 3000, 6, 64, 401, 16);
INSERT INTO data (alternatif, harga, batere, ram, storage, screenres, camerares) VALUES ('hp4', 300, 2900, 3, 32, 282, 13);

COMMIT TRANSACTION;
PRAGMA foreign_keys = on;
