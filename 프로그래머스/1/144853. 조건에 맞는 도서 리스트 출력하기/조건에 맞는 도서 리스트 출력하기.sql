-- 코드를 입력하세요
SELECT book_id, 
    DATE_FORMAT(published_date, '%Y-%m-%d') published_date
FROM book 
WHERE CATEGORY = '인문' 
    AND YEAR(PUBLISHED_DATE) = 2021
ORDER BY published_date 