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

        ShoppingCart cart1 =  ShoppingCartFactory.buildShoppingCart("320201552","Cheese Cake");
        ShoppingCart cart2 =  ShoppingCartFactory.buildShoppingCart("","Blue Culers");


    @Test
    void testBuildShoppingCart() {
        assertNotNull(cart1);
        System.out.println(cart1);


    }

@Test
    void testBuildShoppingCartFail(){
        assertNotNull(cart2);
        System.out.println(cart2);
    }


}