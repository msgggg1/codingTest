-- 코드를 입력하세요
SELECT member_id, member_name, gender, TO_CHAR(date_of_birth, 'YYYY-MM-DD')date_of_birth
FROM member_profile
WHERE TO_CHAR(date_of_birth, 'MM') = '03' AND tlno IS NOT NULL AND gender = 'W'
ORDER BY member_id ASC;