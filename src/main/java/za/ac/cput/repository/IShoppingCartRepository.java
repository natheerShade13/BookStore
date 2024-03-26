package za.ac.cput.repository;

import za.ac.cput.domain.ShoppingCart;

import java.util.List;
/*
IShoppingCartRepository.java
 IShoppingCartRepository Interface
Author: Thabo Tshabalala 221715126 https://github.com/Thabo-Tshabalala
Date: 15/03/2024
 */

public interface IShoppingCartRepository extends IRepository<ShoppingCart, String>{

    List<ShoppingCart> getAll();

}
