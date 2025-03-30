-- SELECT user_id, product_id
-- FROM online_sale
-- GROUP BY user_id, product_id
-- HAVING COUNT(*) > 1
-- ORDER BY user_id, product_id DESC;


--[내 풀이]
SELECT DISTINCT o.user_id, o.product_id
FROM online_sale o join online_sale s ON o.user_id = s.user_id  
                                    AND o.product_id = s.product_id 
                                    AND o.sales_date != s.sales_date
ORDER BY user_id, product_id DESC;

