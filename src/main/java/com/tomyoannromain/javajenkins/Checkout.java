package com.tomyoannromain.javajenkins;

import javax.naming.InsufficientResourcesException;
import java.util.ArrayList;
import java.util.List;

public class Checkout {

    public int checkHowManyDifferentBooks(List<Integer> shoppingCart) {
        List<Integer> numbersOfBooksDifferent = new ArrayList<>();
        for (int i = 0; i < shoppingCart.size(); i++) {
            if (!numbersOfBooksDifferent.contains(shoppingCart.get(i))) {
                numbersOfBooksDifferent.add(shoppingCart.get(i));
            }
        }
        return numbersOfBooksDifferent.size();
    }

    public List<List<BooksLot>> createAllPossibleListOfBooksLot(ShoppingCart shoppingCart){
        List<List<BooksLot>> allPossibleListOfBooksLot = new ArrayList<>();

        return allPossibleListOfBooksLot;
    }

    public List<BooksLot> getAListOfBooksLot(ShoppingCart shoppingCart) {
        List<BooksLot> booksLotList = new ArrayList<>();
        while (!shoppingCart.isEmpty()) {
            int i = 0;
            BooksLot booksLot = new BooksLot(i);
            shoppingCart.removeBooks(i);
            booksLotList.add(booksLot);
        }
        return booksLotList;
    }

    public double calculateTotalPrice(List<BooksLot> booksLotList){
        double totalPrice = 0;
        for (BooksLot booksLot:booksLotList){
            totalPrice+=booksLot.getPrice();
        }
        return totalPrice;
    }


}
