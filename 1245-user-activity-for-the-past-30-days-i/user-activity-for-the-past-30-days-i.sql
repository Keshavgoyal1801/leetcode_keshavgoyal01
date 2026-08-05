# Write your MySQL query statement below
SELECT 
    activity_date AS day, 
    COUNT(DISTINCT user_id) AS active_users
FROM
    Activity
WHERE 
    activity_date BETWEEN '2019-06-28 00:00:00' AND '2019-07-28 23:59:59'
GROUP BY
    day