package za.ac.cput.repository;

import za.ac.cput.domain.Order;

import java.util.List;

public interface IOrderRepository extends IRepository<Order, String>{

    List<Order> getAll();

}
