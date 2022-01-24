package com.tomyoannromain.javajenkins;

import lombok.Data;


/**
 *
 */
@Data
public class BooksLot {
    /**
     *
     */
    private final int numOfBooks;
    /**
     *
     */
    private double discountFactor;
    /**
     *
     */
    private static final int PRICE_ONE_BOOK = 8;


    /**
     * @param numBooks number of books
     */
    public BooksLot(final int numBooks) {
        this.numOfBooks = numBooks;
        switch (numOfBooks) {
            case 2:
                this.discountFactor = 0.95;
                break;
            case 3:
                this.discountFactor = 0.90;
                break;
            case 4:
                this.discountFactor = 0.80;
                break;
            case 5:
                this.discountFactor = 0.75;
                break;
            default:
                this.discountFactor = 1;
        }
    }

    /**
     * @return price of the lot
     */
    public double getPrice() {
        return this.getNumOfBooks() * PRICE_ONE_BOOK * this.getDiscountFactor();
    }

    /**
     * @return the price of one book
     */
    public double getPriceOfOneBook() {
        return PRICE_ONE_BOOK;
    }

}
