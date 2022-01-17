package com.tomyoannromain.javajenkins;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static com.tomyoannromain.javajenkins.Main.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestMain {

    @Test
    public void testCreateArrayListOfInteger(){
        ArrayList<Integer> shoppingCart = createShoppingCart();
        fillShoppingCart(shoppingCart);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0;i<5;i++){
            arrayList.add(0,0);
        }
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
