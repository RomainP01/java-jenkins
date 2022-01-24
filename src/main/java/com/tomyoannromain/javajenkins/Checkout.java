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

    public List<Integer> cloneShoppingCart(List<Integer> shoppingCart){
        return new ArrayList<>(shoppingCart);
    }

    public BooksLot createABooksLot(List<Integer> shoppingCart, int maxBooksInBooksLot) {
        List<Integer> booksToBeRemove = new ArrayList<>();
        while (booksToBeRemove.size() < maxBooksInBooksLot) {
            for (int i = 0; i < shoppingCart.size(); i++) {
                if (booksToBeRemove.size()>=maxBooksInBooksLot){
                    break;
                }
                if (!booksToBeRemove.contains(shoppingCart.get(i))) {
                    booksToBeRemove.add(shoppingCart.get(i));
                    shoppingCart.remove(i);
                }
            }
        }
        return new BooksLot(maxBooksInBooksLot);
    }

    public List<BooksLot> createAListOfBookslot(List<Integer> shoppingCart, int maxSize) {
        List<BooksLot> booksLotList = new ArrayList<>();
        List<Integer> shoppingCartCopy = cloneShoppingCart(shoppingCart);
        while (!shoppingCartCopy.isEmpty()) {
            if (maxSize <= checkHowManyDifferentBooks(shoppingCartCopy)) {
                booksLotList.add(createABooksLot(shoppingCartCopy, maxSize));
            } else {
                maxSize -= 1;
            }
        }
        return booksLotList;
    }

    public List<List<BooksLot>> createAllPossibleListOfBooksLot(List<Integer> shoppingCart) {
        List<List<BooksLot>> allPossibleListOfBooksLot = new ArrayList<>();
        for (int i =checkHowManyDifferentBooks(shoppingCart);i>=1;i--){
            allPossibleListOfBooksLot.add(createAListOfBookslot(shoppingCart,i));
        }
        return allPossibleListOfBooksLot;
    }

    public List<BooksLot> selectBestBooksLot(List<List<BooksLot>> allBooksLot) {
        List<BooksLot> bestBooksLot = null;
        double bestPrice = 0;

        for (List<BooksLot> booksLotList:allBooksLot) {
            double priceOfBooksLotList = calculateTotalPrice(booksLotList);
            if(bestPrice == 0){
                bestPrice=priceOfBooksLotList;
                bestBooksLot = booksLotList;
            }
            else if (bestPrice > priceOfBooksLotList) {
                bestBooksLot = booksLotList;
                bestPrice = priceOfBooksLotList;
            }
        }

        return bestBooksLot;
    }


    public double calculateTotalPrice(List<BooksLot> booksLotList) {
        double totalPrice = 0;
        for (BooksLot booksLot : booksLotList) {
            totalPrice += booksLot.getPrice();
        }
        return totalPrice;
    }

    public List<BooksLot> getBestBooksLotList(List<Integer> shoppingCart){
        return selectBestBooksLot(createAllPossibleListOfBooksLot(shoppingCart));
    }


}
