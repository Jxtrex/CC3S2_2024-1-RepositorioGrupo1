# Actividad Refactorizacion

[Actividad](https://univirtual.uni.pe/pluginfile.php/630235/mod_resource/content/1/Refactorizacion.pdf)

## Ejercicio 1
### Análisis Inicial del Código Fuente
**Métricas de Cohesión**  
**LCOM**
>[!NOTE]
`LCOM = |P| - |Q|`  
`P: número de pares de métodos en la clase que no comparten atributos de instancia`  
`Q: número de pares de métodos que sí comparten atributos de instancia`  

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
P = 8  
Q = 2  
LCOM = 8-2 = 6

**Métricas de Acoplamiento**  
**Instability**

>[!NOTE]
`I = Ce / (Ca + Ce)`  
`Ce: Número de clases externas utilizadas por la clase actual`  
`Ca: Número de clases externas que utilizan la clase actual`

Clases externas usadas por la clase actual:
-   `Employee` y `Department`

Clases externas que utilizan la clase actual:
- `Ninguna`

>Aplicando un `count()` mental tenemos:  
Ce = 2  
Ca = 0  
I = 2/(2+0) = 1  
Concluimos que nuestra clase es completamente inestable y se recomienda dividirla en más clases.

## Ejercicio 2

## Ejercicio 3
## Clase inicial BlogManager
```java 
public class BlogManager {
private List<String> articles = new ArrayList<>();
public void addArticle(String article) {
if (article != null && !article.isEmpty()) {
articles.add(article);
System.out.println("Artículo añadido: " + article);
saveArticleToDatabase(article);
}
}
private void saveArticleToDatabase(String article) {
// Simulación de guardar en la base de datos
System.out.println("Guardando en la base de datos: " + article);
}
public void printAllArticles() {
for (String article : articles) {
System.out.println("Artículo: " + article);
}
}
}
```
El primer cambio que realizaremos es crear 2 clases ArticuloPersistencia y ArticuloImpresion
debido a que la clase BlogManager no cumple con el principio SOLID de responsabilidad unica.

```java 
public class ArticuloPersistencia {
    public static void saveArticleToDatabase(String article) {
    // Simulación de guardar en la base de datos
        System.out.println("Guardando en la base de datos: " + article);
    }


public class ArticuloImpresion {

    public static void printAllArticles(List<String> articles) {
        for (String article : articles) {
            System.out.println("Artículo: " + article);
        }
    }
}
}```
## Ejercicio 4
