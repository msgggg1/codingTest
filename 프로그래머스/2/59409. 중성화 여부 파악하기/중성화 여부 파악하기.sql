-- WHEN INSTR(sex_upon_intake, 'Neutered') > 0 THEN 'O'
-- WHEN REGEXP_LIKE(sex_upon_intake, '^(Neutered|Spayed)') THEN 'O'
SELECT ANIMAL_ID, NAME,
        CASE WHEN sex_upon_intake LIKE 'Neutered%' THEN 'O'
            WHEN sex_upon_intake LIKE 'Spayed%' THEN 'O'
            ELSE 'X'
            END
FROM ANIMAL_INS 
ORDER BY ANIMAL_ID;