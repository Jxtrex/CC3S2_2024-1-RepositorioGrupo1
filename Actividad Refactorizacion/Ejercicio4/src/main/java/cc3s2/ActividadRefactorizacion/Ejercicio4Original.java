package cc3s2.ActividadRefactorizacion;

import java.util.ArrayList;

public class Ejercicio4Original {

    public class InventoryManager {
        private List<Product> products = new ArrayList<>();

        public void addProduct(int id, String name, double price, int quantity) {
            Product product = new Product(id, name, price);
            product.setQuantity(quantity);
            updateInventoryDatabase(product);
            System.out.println("Producto añadido: " + product);
        }

        private void updateInventoryDatabase(Product product) {
// Lógica para actualizar la base de datos
            System.out.println("Actualizando base de datos para: " + product);
        }
    }
}
