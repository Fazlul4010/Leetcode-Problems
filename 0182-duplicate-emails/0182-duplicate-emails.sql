# Write your MySQL query statement below
SELECT email from Person
group by Email having count(email)>1;
