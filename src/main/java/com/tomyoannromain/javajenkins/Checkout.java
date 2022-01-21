package com.tomyoannromain.javajenkins;

import java.util.ArrayList;
import java.util.List;

public class Checkout {

    public int checkHowManyDifferentBooks(ShoppingCart shoppingCart) {
        int numbersOfBooksDifferent = 0;
        for (int i = 0; i < 5; i++) {
            if (shoppingCart.getShoppingCart().get(i) != 0) {
                numbersOfBooksDifferent += 1;

            }
        }
        return numbersOfBooksDifferent;
    }

    public List<BooksLot> getBestPrice(ShoppingCart shoppingCart) {
        List<BooksLot> booksLotList = new ArrayList<>();
        while (!shoppingCart.isEmpty()) {
            int i = checkHowManyDifferentBooks(shoppingCart);
            BooksLot booksLot = new BooksLot(i);
            shoppingCart.removeBooks(i);
            booksLotList.add(booksLot);
        }
        return booksLotList;
    }


}
