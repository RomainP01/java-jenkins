package com.tomyoannromain.javajenkins;

import lombok.Data;

@Data
public class BooksLot {
    private int numOfBooks;
    private double discountFactor;
    private int PRICE_ONE_BOOK = 8;

    public BooksLot(int numOfBooks){
        this.numOfBooks = numOfBooks;
        switch (numOfBooks){
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

    public double getPrice() {
        return this.getNumOfBooks()*this.getPRICE_ONE_BOOK()* this.getDiscountFactor();
    }

    @Override
    public String toString() {
        return "BooksLot{" +
                "numOfBooks=" + numOfBooks +
                ", discount=" + discountFactor +
                '}';
    }
}
