package com.tomyoannromain.javajenkins;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addBookToShoppingCart(4,2);
        shoppingCart.addBookToShoppingCart(3,2);
        System.out.println(shoppingCart);
    }

    public static ArrayList<Integer> createShoppingCart(){
        return new ArrayList<Integer>();
    }

    public static ArrayList<Integer> fillShoppingCart(ArrayList<Integer> shoppingCart){
        for(int i=0;i<5;i++){
            shoppingCart.add(0,0);
        }
        return shoppingCart;
    }

    public static void addHarryPotter(int numberOfBooks, int harryPotterVolume, ArrayList<Integer> shoppingCart){
        shoppingCart.add(harryPotterVolume-1, numberOfBooks);
    }

}
