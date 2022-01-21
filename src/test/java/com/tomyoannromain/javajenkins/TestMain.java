package com.tomyoannromain.javajenkins;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.tomyoannromain.javajenkins.Main.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestMain {

    @Test
    public void testShoppingCartContains0HarryPotter1(){
        List<Integer> shoppingCart = new ArrayList<>();
        assertEquals(0, shoppingCart.size());
    }

    @Test
    public void testShoppingCartContains1HarryPotter1(){
        List<Integer> shoppingCart = new ArrayList<>();
        shoppingCart.add(1);
        assertTrue(shoppingCart.size()==1 && shoppingCart.contains(1));
    }

    @Test
    public void testShoppingCartContains3DifferentsBooks(){
        List<Integer> shoppingCart = new ArrayList<>();
        shoppingCart.add(1);
        shoppingCart.add(2);
        shoppingCart.add(3);
        Checkout checkout = new Checkout();
        assertEquals(3, checkout.checkHowManyDifferentBooks(shoppingCart));

    }

}
