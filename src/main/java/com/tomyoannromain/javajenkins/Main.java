package com.tomyoannromain.javajenkins;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> shoppingCart = new ArrayList<>();
        shoppingCart.add(1);
        shoppingCart.add(1);
        shoppingCart.add(1);
        shoppingCart.add(1);
        Checkout checkout = new Checkout();
        System.out.println(checkout.checkHowManyDifferentBooks(shoppingCart));
    }
}
