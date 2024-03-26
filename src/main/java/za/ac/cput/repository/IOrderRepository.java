package za.ac.cput.repository;

import za.ac.cput.domain.Order;

import java.util.List;

/*IOrderRepository.java
Author: Motlalepula Mbali Kgatlhane (221684212)
Date: 18 March 2024
https://github.com/Mbalsss/BookStore+
 */

public interface IOrderRepository extends IRepository<Order, String>{

    List<Order> getAll();

}
