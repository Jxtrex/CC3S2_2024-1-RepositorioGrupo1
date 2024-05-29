# Actividad Refactorizacion

[Actividad](https://univirtual.uni.pe/pluginfile.php/630235/mod_resource/content/1/Refactorizacion.pdf)

## Ejercicio 1
### Análisis Inicial del Código Fuente
**Métricas de Cohesión**  
La cohesión se refiere a la medida en que las tareas realizadas por un solo módulo son funcionalmente
relacionadas. Una alta cohesión dentro de un módulo es deseable porque significa que el módulo realiza
una tarea bien definida y no está sobrecargado con responsabilidades que no están estrechamente
relacionadas.  
**LCOM**
>[!NOTE]
`LCOM = |P| - |Q|`  
`P: número de pares de métodos en la clase que no comparten atributos de instancia`  
`Q: número de pares de métodos que sí comparten atributos de instancia`  

Funciones funcionalmente relacionadas :
- La clase no tiene atributos de instancia

Funciones de la clase:
- `addEmployee`
- `removeEmployee`  
- `changeDepartment`
- `printDepartmentReport`
- `printAllDepartments`
Que forman 10 pares dos a dos.

>Aplicando un `count()` mental tenemos:  
P = 10  
Q = 0  
LCOM = 10-0 = 10, este valor de LCOM denota baja cohesión y se explica porque todos los métodos son independientes entre síy no comparten atributo de instancia.

**Métricas de Acoplamiento**   
El [acoplamiento](https://univirtual.uni.pe/pluginfile.php/628866/mod_resource/content/3/Metricas-calidad.pdf) se refiere a la medida en que los módulos de un sistema de software dependen unos de otros. Un bajo acoplamiento es deseable porque reduce la complejidad y mejora la mantenibilidad del
sistema. Las métricas de acoplamiento ayudan a identificar las dependencias entre los componentes del
software y evalúan la calidad del diseño.

**Instability**  
La inestabilidad de un módulo se mide para entender la volatilidad potencial de un módulo dentro de la
arquitectura del software. Indica la probabilidad de que un módulo se vea afectado por cambios en
otros módulos.
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

### Análisis luego de refactorizar la clase

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
