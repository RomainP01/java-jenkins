package com.tomyoannromain.javajenkins;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addBookToShoppingCart(4,2);
        shoppingCart.addBookToShoppingCart(3,2);
        Checkout checkout = new Checkout();
        System.out.println(checkout.checkHowManyDifferentBooks(shoppingCart));
        System.out.println(shoppingCart);
    }
}
