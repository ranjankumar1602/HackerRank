/*
Enter your query here.
*/
SELECT DISTINCT CITY FROM STATION
WHERE LOWER(SUBSTR(CITY,LENGTH(CITY),LENGTH(CITY))) IN('a','e','i','o','u');
