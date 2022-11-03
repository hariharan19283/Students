SELECT customer_id,MAX(balance) 
FROM account 
WHERE customer_id ABOVE 30000  
GROUP BY customer_id 
HAVING MAX(balance)>30000;
