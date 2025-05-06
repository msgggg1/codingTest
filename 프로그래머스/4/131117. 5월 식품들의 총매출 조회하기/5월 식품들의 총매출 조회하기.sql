-- FOOD_PRODUCT와 FOOD_ORDER 테이블에서 생산일자가 2022년 5월인 식품들의 식품 ID, 식품 이름, 총매출을 조회하는 SQL문을 작성해주세요. 이때 결과는 총매출을 기준으로 내림차순 정렬해주시고 총매출이 같다면 식품 ID를 기준으로 오름차순 정렬해주세요.

select fp.PRODUCT_ID, fp.PRODUCT_NAME, (price*sum(amount))TOTAL_SALES
from FOOD_PRODUCT fp JOIN FOOD_ORDER fo ON fp.PRODUCT_ID = fo.PRODUCT_ID
WHERE TO_CHAR(PRODUCE_DATE, 'YYMM') = '2205'
GROUP BY fp.PRODUCT_ID, fp.PRODUCT_NAME, price
ORDER BY TOTAL_SALES DESC, fp.PRODUCT_ID;
