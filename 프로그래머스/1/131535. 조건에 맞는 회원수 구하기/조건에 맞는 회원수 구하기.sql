SELECT COUNT(*) users
FROM user_info
WHERE TO_CHAR(joined, 'yyyy') = '2021' AND AGE BETWEEN 20 AND 29;