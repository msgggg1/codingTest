-- 코드를 입력하세요
SELECT *
FROM FOOD_PRODUCT 
WHERE PRICE = (
                SELECT MAX(price)
                FROM FOOD_PRODUCT
                );
