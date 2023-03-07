--List of tab name + field name of all tabs in AD_Window_ID = ‘100’ sorted by tab
--name and field name

SELECT t.Name, f.Name FROM AD_Tab t
JOIN AD_Field f ON t.AD_Tab_ID = f.AD_Tab_ID
WHERE t.AD_Window_ID = 100
ORDER BY t.Name, f.Name;
