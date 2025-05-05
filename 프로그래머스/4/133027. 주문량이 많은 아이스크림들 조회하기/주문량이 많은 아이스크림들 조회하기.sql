-- 7월 아이스크림 총 주문량과 상반기의 아이스크림 총 주문량을 더한 값이 큰 순서대로 상위 3개의 맛을 조회하는 SQL 문을 작성해주세요.
WITH t AS(
    SELECT fh.flavor, sum(fh.total_order)total_o
    FROM FIRST_HALF fh JOIN JULY j ON fh.flavor = j.flavor
    GROUP BY fh.flavor
    ), r AS(
        SELECT flavor, RANK() OVER (ORDER BY total_o DESC)rank
        FROM t
    )
SELECT flavor
FROM r
WHERE rank <= 3 ;
    
  

