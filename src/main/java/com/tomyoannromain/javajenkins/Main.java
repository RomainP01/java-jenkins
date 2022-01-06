package com.tomyoannromain.javajenkins;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> shoppingCart = createShoppingCart();
        System.out.println(shoppingCart);
        addHarryPotter(5,3,shoppingCart);
        System.out.println(shoppingCart);
    }

    public static ArrayList<Integer> createShoppingCart(){
        ArrayList<Integer> shoppingCart = new ArrayList<Integer>();
        for(int i=0;i<5;i++){
            shoppingCart.add(0,0);
        }
        return shoppingCart;
    }

    public static void addHarryPotter(int numberOfBooks, int harryPotterVolume, ArrayList<Integer> shoppingCart){
        shoppingCart.add(harryPotterVolume-1, numberOfBooks);
    }

}
