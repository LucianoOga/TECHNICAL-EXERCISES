--List of all windows with its number of fields, sorting by number of fields starting
--by the windows with a higher number of them

SELECT w.Name,COUNT(f.AD_Field_ID)
FROM AD_Window w
LEFT JOIN AD_Tab t ON w.AD_Window_ID = t.AD_window_ID
LEFT JOIN AD_Field f ON t.AD_Tab_ID = f.AD_Tab_ID
GROUP BY w.Name
ORDER BY numFields DESC;
