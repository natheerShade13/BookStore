package za.ac.cput.repository;
/*OrderRepository.java
Author: Motlalepula Mbali Kgatlhane
221684212
Date: 18 March 2024
 */

import za.ac.cput.domain.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderRepository implements IOrderRepository{
    private static IOrderRepository repository = null;

    private List<Order> orderList;
    private OrderRepository(){
        orderList = new ArrayList<Order>();
    }

    public static IOrderRepository getRepository(){
        if(repository == null){
            repository = new OrderRepository();
        }
        return repository;
    }

    @Override
    public List<Order> getAll() {
        return orderList;
    }


    @Override
    public Order create(Order order) {
        boolean success = orderList.add(order);
        if(success){
            return order;
        }
        return null;
    }

    @Override
    public Order read(String orderID) {
        for(Order order: orderList){
            if(order.getOrderID().equals(orderID))
                return order;
        }
        return null;
    }

    @Override
    public Order update(Order order) {
        String id = order.getOrderID();
        Order Oldorder = read(id);
        if(Oldorder == null){
            return null;
        }
        boolean success = delete(id);
        if(success){
            orderList.add(order);
                return order;
        }
        return null;
    }

    @Override
    public boolean delete(String orderID) {
        Order orderToDelete = read(orderID);
        if(orderToDelete == null){
            return false;
        }
        return(orderList.remove(orderToDelete));
    }


}
