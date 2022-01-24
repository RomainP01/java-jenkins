package com.tomyoannromain.javajenkins;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Main {

    /**
     * @param args arguments
     */
    public static void main(String[] args) {
        List<Integer> shoppingCart = new ArrayList<>();
        shoppingCart.add(1);
        shoppingCart.add(1);
        shoppingCart.add(2);
        shoppingCart.add(2);
        shoppingCart.add(3);
        shoppingCart.add(3);
        shoppingCart.add(4);
        shoppingCart.add(5);
        Checkout checkout = new Checkout();
        System.out.println(checkout.getBestBooksLotList(shoppingCart));
    }
}
