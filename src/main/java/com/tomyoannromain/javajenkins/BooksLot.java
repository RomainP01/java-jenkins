package com.tomyoannromain.javajenkins;

import lombok.Data;

@Data
public class BooksLot {
    private int numOfBooks;
    private int discount;

    public BooksLot(int numOfBooks){
        this.numOfBooks = numOfBooks;
        switch (numOfBooks){
            case 2:
                this.discount = 5;
                break;
            case 3:
                this.discount = 10;
                break;
            case 4:
                this.discount = 20;
                break;
            case 5:
                this.discount = 25;
                break;
            default:
                this.discount = 0;
        }
    }
}
