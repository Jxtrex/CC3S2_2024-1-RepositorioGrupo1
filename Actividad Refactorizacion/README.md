# Actividad Refactorizacion

[Actividad](https://univirtual.uni.pe/pluginfile.php/630235/mod_resource/content/1/Refactorizacion.pdf)

## Ejercicio 1
Usaremos la métrica LCOM para medir la cohesión en el módulo.

>[!NOTE]
>`LCOM = |P| - |Q|`  
>`P: número de pares de métodos en la clase que no comparten atributos de instancia`  
>`Q: número de pares de métodos que sí comparten atributos de instancia`  

Funciones funcionalmente relacionadas :
-   `addEmployee` y `removeEmployee`
-   `addEmployee` y `printDepartmentReport`


Funciones funcionalmente no relacionadas:
- `addEmployee` y `changeDepartment`
- `addEmployee` y `printAllDepartments`
- `removeEmployee` y `changeDepartment`
- `removeEmployee` y `printDepartmentReport`
- `removeEmployee` y `printAllDepartments`
- `changeDepartment` y `printDepartmentReport`
- `changeDepartment` y `printAllDepartments`
- `printDepartmentReport` y `printAllDepartments`

>Aplicando un `count()` mental tenemos:  
>P = 8  
>Q = 2  
>LCOM = 8-2 = 6



## Ejercicio 2

## Ejercicio 3

## Ejercicio 4
