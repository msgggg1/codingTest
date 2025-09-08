-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME,
        CASE WHEN sex_upon_intake LIKE 'Neutered%' THEN 'O'
            WHEN sex_upon_intake LIKE 'Spayed%' THEN 'O'
            ELSE 'X'
            END
FROM ANIMAL_INS 
ORDER BY ANIMAL_ID;