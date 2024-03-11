package za.ac.cput.repository;

import za.ac.cput.domain.ShoppingCart;

import java.util.List;

public interface IShoppingCartRepository extends IRepository<ShoppingCart, String>{

    List<ShoppingCart> getAll();

}
