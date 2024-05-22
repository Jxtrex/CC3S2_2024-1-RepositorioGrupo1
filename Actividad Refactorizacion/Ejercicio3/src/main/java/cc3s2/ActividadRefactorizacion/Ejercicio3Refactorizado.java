package cc3s2.ActividadRefactorizacion;

import java.util.ArrayList;
import java.util.List;
public class Ejercicio3Refactorizado {

    public class BlogManager {
        private List<String> articles = new ArrayList<>();
        private ArticuloBaseDatos baseDatos;
        public void addArticle(String article) {
            if (article != null && !article.isEmpty()) {
                articles.add(article);
                System.out.println("Artículo añadido: " + article);
                guardarArticulo(article);
            }
        }
        public void guardarArticulo(String article){
            baseDatos = new ArticuloBaseDatos();
            baseDatos.saveArticleToDatabase(article);
        }

    }

    public interface GuardarArticulos {
        void saveArticleToDatabase(String article);
    }

    public class ArticuloBaseDatos implements GuardarArticulos {
        @Override
        public void saveArticleToDatabase(String article) {
            // Simulación de guardar en la base de datos
            System.out.println("Guardando en la base de datos: " + article);
        }
    }
    public class ArticuloImpresion {

        public static void printAllArticles(List<String> articles) {
            for (String article : articles) {
                System.out.println("Artículo: " + article);
            }
        }
    }
}
