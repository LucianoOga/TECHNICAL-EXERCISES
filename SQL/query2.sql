--Update window with AD_Window_ID = ‘100’ appending ‘--’ to the name of window with AD_Window_ID = ‘100’


UPDATE AD_Window
SET Name =  '--'
WHERE AD_Window_ID = 100;             --Esta consulta reemplaza el nombre por '--'


UPDATE AD_Window
SET Name = CONCAT(Name, '--')         --Esta consulta concatena el nombre con '--'
WHERE AD_Window_ID = 100;
