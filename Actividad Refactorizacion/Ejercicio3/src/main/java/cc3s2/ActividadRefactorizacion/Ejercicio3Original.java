package cc3s2.ActividadRefactorizacion;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio3Original {

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

}
