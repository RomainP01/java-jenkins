package com.tomyoannromain.javajenkins;

public class Checkout {

    public int checkHowManyDifferentsBooks(ShoppingCart shoppingCart){
        int numbersOfBooksDifferent = 0;
        for(int i=0;i<5;i++){
            if(shoppingCart.getShoppingCart().get(i) !=0){
                numbersOfBooksDifferent+=1;

            }
        }
        return numbersOfBooksDifferent;
    }
}
