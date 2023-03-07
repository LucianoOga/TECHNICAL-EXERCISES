--Name and number of tabs of all windows

SELECT w.Name, COUNT(t.AD_Tab_ID)
FROM AD_Window w
LEFT JOIN AD_Tab t ON w.AD_Window_ID = t.AD_Window_ID
GROUP BY w.Name;
