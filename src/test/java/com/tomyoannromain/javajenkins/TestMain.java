package com.tomyoannromain.javajenkins;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static com.tomyoannromain.javajenkins.Main.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestMain {

    @Test
    public void testShoppinCartIsAnEmptyArrayListOf5Integers(){
        ShoppingCart shoppingCart = new ShoppingCart();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0;i<5;i++){
            arrayList.add(0,0);
        }
        assertEquals(shoppingCart.getShoppingCart(),arrayList);
    }

    @Test
    public void testShoppingCartContains0HarryPotter1(){
        ShoppingCart shoppingCart = new ShoppingCart();
        assertEquals(0, shoppingCart.getHarryPotter1());
    }

    @Test
    public void testShoppingCartContains1HarryPotter1(){
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addBookToShoppingCart(1,1);
        assertEquals(1, shoppingCart.getHarryPotter1());
    }

    @Test
    public void testShoppingCartContains3DifferentsBooks(){
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addBookToShoppingCart(1,1);
        shoppingCart.addBookToShoppingCart(2,1);
        shoppingCart.addBookToShoppingCart(3,1);
        Checkout checkout = new Checkout();
        assertEquals(3, checkout.checkHowManyDifferentsBooks(shoppingCart));
    }

}
