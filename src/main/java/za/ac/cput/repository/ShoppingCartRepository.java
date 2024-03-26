package za.ac.cput.repository;
import za.ac.cput.domain.ShoppingCart;
import java.util.ArrayList;
import java.util.List;
/*
ShoppingCartRepository.java
ShoppingCartRepository class
Author: Thabo Tshabalala 221715126 https://github.com/Thabo-Tshabalala
Date: 15/03/2024
 */

public class ShoppingCartRepository implements IShoppingCartRepository{
    private static IShoppingCartRepository repository = null;

    private List<ShoppingCart> itemList;

    private ShoppingCartRepository(){
        itemList = new ArrayList<ShoppingCart>();
    }

    public static IShoppingCartRepository getRepository(){
        if(repository == null)
            repository = new ShoppingCartRepository();

        return repository;
    }


    @Override
    public ShoppingCart create(ShoppingCart shoppingCart) {
        boolean success = itemList.add(shoppingCart);
        if(success){
            return shoppingCart;
        }
        return null;
    }

    @Override
    public ShoppingCart read(String s) {

        for(ShoppingCart e : itemList){
            if(e.getCartID().equals(s))
                return e;
        }
        return null;
    }

    @Override
    public ShoppingCart update(ShoppingCart shoppingCart) {
        String id = shoppingCart.getCartID();
        if (read(id) != null) {
            if (delete(id)) {
                if (itemList.add(shoppingCart)) {
                    return shoppingCart;
                }
            }
        }
        return null;
    }

    @Override
    public boolean delete(String s) {


        ShoppingCart itemToDelete = read(s);
        if (itemToDelete == null)
           return false;

        return itemList.remove(itemToDelete);
    }

    @Override
    public List<ShoppingCart> getAll() {
        return itemList;
    }
}
