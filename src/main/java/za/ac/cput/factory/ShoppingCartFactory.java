package za.ac.cput.factory;
import za.ac.cput.domain.ShoppingCart;
import za.ac.cput.util.Helper;

/*
ShoppingCartFactory.java
ShoppingCartFactory class
Author: Thabo Tshabalala 221715126 https://github.com/Thabo-Tshabalala
Date: 15/03/2024
 */
public class ShoppingCartFactory {
    public static ShoppingCart buildShoppingCart(String cartID, String item) {
        if (Helper.isNullOrEmpty(cartID) || Helper.isNullOrEmpty(item))
            return null;
        return new ShoppingCart.Builder().setCartID(cartID).setItems(item).build();
    }
    public static ShoppingCart buildShoppingCart(String item) {
        if ( Helper.isNullOrEmpty(item))


            return null;
        String cartID= Helper.generateID();
        return new ShoppingCart.Builder().setCartID(cartID).setItems(item).build();
    }


}
