-- Use this to test application updates.

--Part 1

SELECT column_name, data_type
FROM information_schema.columns
WHERE table_name = 'job';

--Part 2

SELECT name
FROM employer
WHERE location = "St. Louis City";

--Part 3

DROP TABLE job;

--Part 4
