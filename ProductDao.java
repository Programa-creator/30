package org.example;

import java.util.List;

public interface ProductDao {

    void addProduct(Product product);

    void deleteProduct(int id);

    Product getProductById(int id);

    List<Product> getAllProducts();
}
