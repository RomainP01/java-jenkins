package com.tomyoannromain.javajenkins;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addBookToShoppingCart(1,2);
        shoppingCart.addBookToShoppingCart(2,2);
        shoppingCart.addBookToShoppingCart(3,4);
        Checkout checkout = new Checkout();
        List<BooksLot> booksLotList = checkout.getBestPrice(shoppingCart);
        System.out.println(booksLotList);
    }
}
