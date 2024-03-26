package za.ac.cput.repository;

/*
IRepository.java
Repository interface
Author: Natheer Shade 217159109
https://github.com/natheerShade13
Date: 13/03/2024
 */

public interface IRepository<T, ID> {

    T create(T t);

    T read(ID id);

    T update(T t);

    boolean delete(ID id);

}
