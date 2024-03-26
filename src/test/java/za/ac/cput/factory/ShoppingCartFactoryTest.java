package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.ShoppingCart;
import static org.junit.jupiter.api.Assertions.*;
/*
ShoppingCartFactoryTest.javaa
ShoppingCartFactoryTest class
Author: Thabo Tshabalala 221715126 https://github.com/Thabo-Tshabalala
Date: 15/03/2024
 */
class ShoppingCartFactoryTest {


    String cartID = "320201552";
    String item = "Cheese Cake";
        ShoppingCart cart1 =  ShoppingCartFactory.buildShoppingCart("320201552","Cheese Cake");
        ShoppingCart cart2 =  ShoppingCartFactory.buildShoppingCart("Blue Culers");


    @Test
    void testBuildShoppingCart_1() {
        assertNotNull(cart1);
        assertEquals(cartID, cart1.getCartID());
        assertEquals(item, cart1.getItems());
        assertNotSame(item,cart2.getItems());
        System.out.println(cart1);


    }

@Test
    void testBuildShoppingCart_2(){
        assertNotNull(cart2);
        assertNotSame(cartID, cart2.getCartID());
    System.out.println(cart2);
    }


}