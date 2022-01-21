package com.tomyoannromain.javajenkins;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;

@Data
public class ShoppingCart {
    private int harryPotter1 = 0;
    private int harryPotter2 = 0;
    private int harryPotter3 = 0;
    private int harryPotter4 = 0;
    private int harryPotter5 = 0;
    private ArrayList<Integer> shoppingCart = new ArrayList<>(Arrays.asList(harryPotter1, harryPotter2, harryPotter3, harryPotter4, harryPotter5));


    public void addBookToShoppingCart(int harryPottersVolume, int numberOfBooks) {
        setSettersHarryPottersBook(harryPottersVolume, getGettersHarryPottersBooks(harryPottersVolume) + numberOfBooks);
        shoppingCart.remove(harryPottersVolume - 1);
        shoppingCart.add(harryPottersVolume - 1, getGettersHarryPottersBooks(harryPottersVolume));
    }




    public int getGettersHarryPottersBooks(int number) {
        switch (number) {
            case 1:
                return getHarryPotter1();
            case 2:
                return getHarryPotter2();
            case 3:
                return getHarryPotter3();
            case 4:
                return getHarryPotter4();
            case 5:
                return getHarryPotter5();
            default:
                return 0;
        }
    }

    public void setSettersHarryPottersBook(int index, int harryPotter) {
        switch (index) {
            case 1:
                this.harryPotter1 = harryPotter;
                break;
            case 2:
                this.harryPotter2 = harryPotter;
                break;
            case 3:
                this.harryPotter3 = harryPotter;
                break;
            case 4:
                this.harryPotter4 = harryPotter;
                break;
            case 5:
                this.harryPotter5 = harryPotter;
                break;
            default:
                System.out.println("mauvais choix");
        }
    }

    public void removeBooks(int i) {
        int j=0;
        while (j<i){
            for (int k=0;k<5;k++){
                if (getGettersHarryPottersBooks(k+1) >= 1) {
                    setSettersHarryPottersBook(k+1, getGettersHarryPottersBooks(k+1) - 1);
                    shoppingCart.remove(k);
                    shoppingCart.add(k , getGettersHarryPottersBooks(k+1));
                    j+=1;
                }
            }

        }
    }

    public boolean isEmpty(){
        boolean isEmpty = false;
        int numOfNullBooks = 0;
        for (int i = 0; i<5;i++){
            if (getGettersHarryPottersBooks(i)==0){
                numOfNullBooks+=1;
            }
        }
        if (numOfNullBooks == shoppingCart.size()){
            isEmpty = true;
        }
        return isEmpty;
    }


    @Override
    public String toString() {
        return "ShoppingCart{" +
                "harryPotter1=" + harryPotter1 +
                ", harryPotter2=" + harryPotter2 +
                ", harryPotter3=" + harryPotter3 +
                ", harryPotter4=" + harryPotter4 +
                ", harryPotter5=" + harryPotter5 +
                ", shoppingCart=" + shoppingCart +
                '}';
    }
}
