package com.tomyoannromain.javajenkins;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestMain {

    @Test
    public void testShoppingCartContains0HarryPotter1() {
        List<Integer> shoppingCart = new ArrayList<>();
        assertEquals(0, shoppingCart.size());
    }

    @Test
    public void testShoppingCartContains1HarryPotter1() {
        List<Integer> shoppingCart = new ArrayList<>();
        shoppingCart.add(1);
        assertTrue(shoppingCart.size() == 1 && shoppingCart.contains(1));
    }

    @Test
    public void testShoppingCartContains3DifferentsBooks() {
        List<Integer> shoppingCart = new ArrayList<>();
        shoppingCart.add(1);
        shoppingCart.add(2);
        shoppingCart.add(3);
        Checkout checkout = new Checkout();
        assertEquals(3, checkout.checkHowManyDifferentBooks(shoppingCart));

    }

    @Test
    public void testBooksLotWith4InConstructorHas4BooksInside() {
        BooksLot booksLot = new BooksLot(4);
        assertEquals(4, booksLot.getNumOfBooks());
    }


    @Test
    public void testBooksLotWith1HasTheSamePriceAsWithoutDiscount() {
        BooksLot booksLot = new BooksLot(1);
        assertEquals(booksLot.getPriceOfOneBook(), booksLot.getPrice());
    }

    @Test
    public void testBooksLotWithTwoBooksHas5PercentDiscount() {
        BooksLot booksLot = new BooksLot(2);
        assertEquals(0.95, booksLot.getDiscountFactor());
    }

    @Test
    public void testBooksLotWithThreeBooksHasGoodTotalPrice() {
        BooksLot booksLot = new BooksLot(3);
        assertEquals(21.6, booksLot.getPrice());
    }

    @Test
    public void testCloneOfShoppingCartGivesTheSameContentThanTheShoppingCart() {
        List<Integer> shoppingCart = new ArrayList<>();
        shoppingCart.add(1);
        shoppingCart.add(2);
        shoppingCart.add(3);
        Checkout checkout = new Checkout();
        assertTrue(checkout.cloneShoppingCart(shoppingCart).containsAll(shoppingCart));
    }

    @Test
    public void testListOfTwoBooksLotContaining4BooksHasTheGoodPrice() {
        double priceExpected = 4 * 8 * 0.80 + 4 * 8 * 0.80;
        List<BooksLot> booksLotList = new ArrayList<>();
        booksLotList.add(new BooksLot(4));
        booksLotList.add(new BooksLot(4));
        Checkout checkout = new Checkout();
        assertEquals(priceExpected, checkout.calculateTotalPrice(booksLotList));
    }

    @Test
    public void testChooseTheBestListOfBooksLotBetween4and4Or5and3() {
        List<BooksLot> firstBooksLotList = new ArrayList<>();
        firstBooksLotList.add(new BooksLot(4));
        firstBooksLotList.add(new BooksLot(4));
        List<BooksLot> secondBooksLotList = new ArrayList<>();
        secondBooksLotList.add(new BooksLot(5));
        secondBooksLotList.add(new BooksLot(3));
        List<List<BooksLot>> lists = new ArrayList<>();
        lists.add(firstBooksLotList);
        lists.add(secondBooksLotList);
        Checkout checkout = new Checkout();
        assertTrue(checkout.selectBestBooksLot(lists).containsAll(firstBooksLotList));
    }

    @Test
    public void testCreateABooksLotWithAMaxBooksDefinedAt3(){
        List<Integer> shoppingCart = new ArrayList<>();
        shoppingCart.add(1);
        shoppingCart.add(2);
        shoppingCart.add(3);
        shoppingCart.add(4);
        shoppingCart.add(5);
        Checkout checkout = new Checkout();
        assertEquals(3,checkout.createABooksLot(shoppingCart,3).getNumOfBooks());
    }

    @Test
    public void testCreateAListOfBooksLotWithAMaxBooksDefinedAt4(){
        List<Integer> shoppingCart = new ArrayList<>();
        shoppingCart.add(1);
        shoppingCart.add(2);
        shoppingCart.add(3);
        shoppingCart.add(1);
        shoppingCart.add(2);
        shoppingCart.add(3);
        shoppingCart.add(4);
        shoppingCart.add(5);
        List<BooksLot> expectedbooksLotList = new ArrayList<>();
        expectedbooksLotList.add(new BooksLot(4));
        expectedbooksLotList.add(new BooksLot(4));
        Checkout checkout = new Checkout();
        assertTrue(checkout.createAListOfBookslot(shoppingCart,4).containsAll(expectedbooksLotList));
    }

    @Test
    public void testcreateAllPossibleListOfBooksLotWithAShoppingCartWith3Books(){
        List<Integer> shoppingCart = new ArrayList<>();
        shoppingCart.add(1);
        shoppingCart.add(2);
        shoppingCart.add(3);
        List<List<BooksLot>> expectedListOfLists = new ArrayList<>();
        List<BooksLot> firstPossibleList = new ArrayList<>();
        firstPossibleList.add(new BooksLot(3));
        List<BooksLot> secondPossibleList = new ArrayList<>();
        secondPossibleList.add(new BooksLot(2));
        secondPossibleList.add(new BooksLot(1));
        List<BooksLot> thirdPossibleList = new ArrayList<>();
        thirdPossibleList.add(new BooksLot(1));
        thirdPossibleList.add(new BooksLot(1));
        thirdPossibleList.add(new BooksLot(1));
        expectedListOfLists.add(firstPossibleList);
        expectedListOfLists.add(secondPossibleList);
        expectedListOfLists.add(thirdPossibleList);
        Checkout checkout = new Checkout();
        assertTrue(expectedListOfLists.containsAll(checkout.createAllPossibleListOfBooksLot(shoppingCart)));
    }

    @Test
    public void testgetBestBooksLotListFromAShoppingCartOf3Books(){
        List<Integer> shoppingCart = new ArrayList<>();
        shoppingCart.add(1);
        shoppingCart.add(2);
        shoppingCart.add(3);
        List<List<BooksLot>> listOfLists = new ArrayList<>();
        List<BooksLot> firstPossibleList = new ArrayList<>();
        firstPossibleList.add(new BooksLot(3));
        List<BooksLot> secondPossibleList = new ArrayList<>();
        secondPossibleList.add(new BooksLot(2));
        secondPossibleList.add(new BooksLot(1));
        List<BooksLot> thirdPossibleList = new ArrayList<>();
        thirdPossibleList.add(new BooksLot(1));
        thirdPossibleList.add(new BooksLot(1));
        thirdPossibleList.add(new BooksLot(1));
        listOfLists.add(firstPossibleList);
        listOfLists.add(secondPossibleList);
        listOfLists.add(thirdPossibleList);
        Checkout checkout = new Checkout();
        assertTrue(firstPossibleList.containsAll(checkout.selectBestBooksLot(listOfLists)));
    }


}
