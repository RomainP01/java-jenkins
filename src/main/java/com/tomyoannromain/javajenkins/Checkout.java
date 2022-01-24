package com.tomyoannromain.javajenkins;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Checkout {

    /**
     * @param shoppingCart all of the books
     * @return the numbers of books differents
     */
    public int checkHowManyDifferentBooks(final List<Integer> shoppingCart) {
        List<Integer> numbersOfBooksDifferent = new ArrayList<>();
        for (Integer integer : shoppingCart) {
            if (!numbersOfBooksDifferent.contains(integer)) {
                numbersOfBooksDifferent.add(integer);
            }
        }
        return numbersOfBooksDifferent.size();
    }

    /**
     * @param shoppingCart all of the books
     * @return an array containing the same books
     */
    public List<Integer> cloneShoppingCart(final List<Integer> shoppingCart) {
        return new ArrayList<>(shoppingCart);
    }

    /**
     * @param shoppingCart       all of the books
     * @param maxBooksInBooksLot the max desired books in a lot
     * @return a books lot with a number of books equals to the max size
     */
    public BooksLot createABooksLot(
            final List<Integer> shoppingCart, final int maxBooksInBooksLot
    ) {
        List<Integer> booksToBeRemove = new ArrayList<>();
        while (booksToBeRemove.size() < maxBooksInBooksLot) {
            for (int i = 0; i < shoppingCart.size(); i++) {
                if (booksToBeRemove.size() >= maxBooksInBooksLot) {
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

    /**
     * @param shoppingCart all of the books
     * @param maxSize      the max books in a lot
     * @return a list of books lot containing books between 1 and the max size
     */
    public List<BooksLot> createAListOfBookslot(
            final List<Integer> shoppingCart, int maxSize
    ) {
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

    /**
     * @param shoppingCart all of the books
     * @return all lists of lots possibles
     */
    public List<List<BooksLot>> createAllPossibleListOfBooksLot(
            final List<Integer> shoppingCart
    ) {
        List<List<BooksLot>> allPossibleListOfBooksLot = new ArrayList<>();
        for (int i = checkHowManyDifferentBooks(shoppingCart); i >= 1; i--) {
            allPossibleListOfBooksLot.add(
                    createAListOfBookslot(shoppingCart, i)
            );
        }
        return allPossibleListOfBooksLot;
    }

    /**
     * @param allBooksLot all lists of lots possibles
     * @return the one with the best total price
     */
    public List<BooksLot> selectBestBooksLot(
            final List<List<BooksLot>> allBooksLot
    ) {
        List<BooksLot> bestBooksLot = null;
        double bestPrice = 0;

        for (List<BooksLot> booksLotList : allBooksLot) {
            double priceOfBooksLotList = calculateTotalPrice(booksLotList);
            if (bestPrice == 0) {
                bestPrice = priceOfBooksLotList;
                bestBooksLot = booksLotList;
            } else if (bestPrice > priceOfBooksLotList) {
                bestBooksLot = booksLotList;
                bestPrice = priceOfBooksLotList;
            }
        }

        return bestBooksLot;
    }


    /**
     * @param booksLotList a list of booksLot
     * @return the total price of the list of bookslot
     */
    public double calculateTotalPrice(
            final List<BooksLot> booksLotList
    ) {
        double totalPrice = 0;
        for (BooksLot booksLot : booksLotList) {
            totalPrice += booksLot.getPrice();
        }
        return totalPrice;
    }

    /**
     * @param shoppingCart all of the books
     * @return the books Lot with the best price
     */
    public List<BooksLot> getBestBooksLotList(
            final List<Integer> shoppingCart
    ) {
        return selectBestBooksLot(
                createAllPossibleListOfBooksLot(shoppingCart)
        );
    }


}
