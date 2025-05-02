-- CAR_RENTAL_COMPANY_CAR 테이블과 CAR_RENTAL_COMPANY_RENTAL_HISTORY 테이블과 CAR_RENTAL_COMPANY_DISCOUNT_PLAN 테이블에서 자동차 종류가 '세단' 또는 'SUV' 인 자동차 중 2022년 11월 1일부터 2022년 11월 30일까지 대여 가능하고 30일간의 대여 금액이 50만원 이상 200만원 미만인 자동차에 대해서 자동차 ID, 자동차 종류, 대여 금액(컬럼명: FEE) 리스트를 출력하는 SQL문을 작성해주세요. 결과는 대여 금액을 기준으로 내림차순 정렬하고, 대여 금액이 같은 경우 자동차 종류를 기준으로 오름차순 정렬, 자동차 종류까지 같은 경우 자동차 ID를 기준으로 내림차순 정렬해주세요.
-- 코드를 입력하세요
WITH monthFee AS (
    SELECT car_id, cc.car_type, daily_fee*30*(1-(TO_NUMBER(REPLACE(discount_rate, '%')) / 100)) AS fee
    FROM CAR_RENTAL_COMPANY_CAR cc JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN dp ON cc.car_type = dp.car_type
    WHERE cc.car_type in ('세단', 'SUV') AND duration_type = '30일 이상'
), available AS (
    SELECT car_id
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
    WHERE TO_CHAR(start_date, 'YYMMDD') <= 221130 AND TO_CHAR(end_date, 'YYMMDD') >= 221101 
)
SELECT *
FROM monthFee
WHERE car_id NOT IN (SELECT car_id FROM available)
        AND fee >= 500000 AND fee < 2000000
ORDER BY fee DESC, car_type, car_id DESC;