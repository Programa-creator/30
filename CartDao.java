package org.example;

import java.util.List;

public interface CartDao {

    void addCart(Cart cart);

    void deleteCart(int id);

    Cart getCartById(int id);

    List<Cart> getAllCarts();
}
