package za.ac.cput.repository;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.ShoppingCart;
import za.ac.cput.factory.ShoppingCartFactory;
import static org.junit.jupiter.api.Assertions.*;

/*
ShoppingCartRepositoryTest.java
ShoppingCartRepositoryTest class
Author: Thabo Tshabalala 221715126 https://github.com/Thabo-Tshabalala
Date: 15/03/2024
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class ShoppingCartRepositoryTest {

    private static IShoppingCartRepository repository= ShoppingCartRepository.getRepository();
    private ShoppingCart cart1 = ShoppingCartFactory.buildShoppingCart("876543","Apple Munch");
    private ShoppingCart cart2 = ShoppingCartFactory.buildShoppingCart("546546","Rose");


    @Test
    @Order(1)
    void create() {
        ShoppingCart add = repository.create(cart1);
        assertNotNull(add);
        System.out.println(add);
        ShoppingCart add2 = repository.create(cart2);
        assertNotNull(add2);
        System.out.println(add2);
    }

    @Test
    @Order(2)
    void read() {


        String cartID =cart1.getCartID();
        String cartID2 =cart2.getCartID();
        ShoppingCart read = repository.read(cartID);
        assertNotNull(read);

        ShoppingCart read2 = repository.read(cartID2);
        assertNotNull(read2);
        System.out.println(read+ "\n"+ read2);
    }

    @Test
    @Order(3)
    void update() {


        ShoppingCart newCart = new ShoppingCart.Builder().copy( cart1).setItems("Zing Zong").build();
        ShoppingCart newCart2 = new ShoppingCart.Builder().copy( cart2).setItems("Regular Snacks").build();

        ShoppingCart updatedCart = repository.update(newCart);
        ShoppingCart updatedCart2 = repository.update(newCart2);

        assertNotNull(updatedCart);
        assertNotNull(updatedCart2);
        System.out.println(updatedCart+ "\n"+ updatedCart2);
    }

    @Test
    @Order(5)
    void delete() {
        assertTrue(repository.delete(cart1.getCartID()));
        assertTrue(repository.delete(cart2.getCartID()));
        System.out.println("Cart Successfully deleted");

    }

    @Test
    @Order(4)
    void getAll() {
        System.out.println(repository.getAll());
    }
}