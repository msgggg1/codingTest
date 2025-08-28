-- 식당 ID, 식당 이름, 음식 종류, 즐겨찾기수, 주소, 리뷰 평균 점수를 조회
-- 리뷰 평균점수는 소수점 세 번째 자리에서 반올림 해주시고 
-- 결과는 평균점수를 기준으로 내림차순 정렬해주시고, 
-- 평균점수가 같다면 즐겨찾기수를 기준으로 내림차순 정렬해주세요.
SELECT i.rest_id, i.rest_name, i.food_type, i.favorites, i.address
        , ROUND(AVG(r.review_score), 2)score
FROM rest_info i JOIN rest_review r ON i.rest_id = r.rest_id
WHERE i.address LIKE '서울%'
GROUP BY i.rest_id, i.rest_name, i.food_type, i.favorites, i.address
ORDER BY score DESC, favorites DESC;