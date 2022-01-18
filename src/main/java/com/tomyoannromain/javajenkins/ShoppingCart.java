package com.tomyoannromain.javajenkins;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;

@Data
public class ShoppingCart {
    private int harryPotter1 =0;
    private int harryPotter2 =0;
    private int harryPotter3 =0;
    private int harryPotter4 =0;
    private int harryPotter5 =0;
    private ArrayList<Integer> shoppingCart = new ArrayList<>(Arrays.asList(harryPotter1, harryPotter2,harryPotter3,harryPotter4,harryPotter5));;


    public void addBookToShoppingCart(int harryPottersVolume, int numberOfBooks){
        switch(harryPottersVolume){
            case 1:
                setHarryPotter1(getHarryPotter1()+numberOfBooks);
                shoppingCart.remove(0);
                shoppingCart.add(0,getHarryPotter1());
                break;

            case 2:
                setHarryPotter2(getHarryPotter2()+harryPottersVolume);
                shoppingCart.remove(1);
                shoppingCart.add(1,getHarryPotter2());
                break;

            case 3:
                setHarryPotter3(getHarryPotter3()+harryPottersVolume);
                shoppingCart.remove(2);
                shoppingCart.add(2,getHarryPotter3());
                break;
            case 4:
                setHarryPotter4(getHarryPotter4()+harryPottersVolume);
                shoppingCart.remove(3);
                shoppingCart.add(3,getHarryPotter4());
                break;

            case 5:
                setHarryPotter5(getHarryPotter5()+harryPottersVolume);
                shoppingCart.remove(4);
                shoppingCart.add(4,getHarryPotter5());
                break;
            default:
                System.out.println("Choix incorrect");
                break;
        }
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
