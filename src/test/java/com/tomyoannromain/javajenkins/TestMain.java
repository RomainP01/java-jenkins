package com.tomyoannromain.javajenkins;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static com.tomyoannromain.javajenkins.Main.addHarryPotter;
import static com.tomyoannromain.javajenkins.Main.createShoppingCart;
import static org.junit.jupiter.api.Assertions.*;

public class TestMain {

    @Test
    public void testCreateArrayListOfInteger(){
        ArrayList<Integer> shoppingCart = createShoppingCart();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        assertEquals(shoppingCart,arrayList);
    }

    @Test
    public void testShoppingCartContains0HarryPotter(){
        ArrayList<Integer> shoppingCart = createShoppingCart();
        assertTrue(shoppingCart.isEmpty());
    }

    @Test
    public void testShoppingCartContains1HarryPotter1(){
        ArrayList<Integer> shoppingCart = createShoppingCart();
        addHarryPotter(1,1,shoppingCart);
        assertEquals(1,shoppingCart.get(0));
    }

}
