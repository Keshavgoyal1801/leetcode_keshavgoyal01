SELECT
    sp.name
FROM Orders o
JOIN Company c
    ON o.com_id = c.com_id
RIGHT JOIN SalesPerson sp
    ON o.sales_id = sp.sales_id
GROUP BY
    sp.sales_id,
    sp.name
HAVING
    SUM(CASE WHEN c.name = 'RED' THEN 1 ELSE 0 END) = 0;
    