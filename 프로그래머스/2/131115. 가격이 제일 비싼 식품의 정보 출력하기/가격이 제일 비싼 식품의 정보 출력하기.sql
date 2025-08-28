-- 내 코드
-- SELECT *
-- FROM FOOD_PRODUCT 
-- WHERE PRICE = (
--                 SELECT MAX(price)
--                 FROM FOOD_PRODUCT
--                 );
                
SELECT *
FROM FOOD_PRODUCT
ORDER BY PRICE DESC
FETCH FIRST 1 ROWS ONLY;