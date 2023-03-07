--Windows with more than 5 tabs

SELECT Name FROM AD_Window WHERE AD_Window_ID IN (
SELECT AD_Window_ID FROM AD_Tab GROUP BY AD_Window_ID HAVING COUNT(*) > 5)

