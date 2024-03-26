package za.ac.cput.factory;


import za.ac.cput.domain.Book;
import za.ac.cput.util.Helper;

/*
BookFactory.java
Book factory class
Author: Natheer Shade 217159109
https://github.com/natheerShade13
Date: 13/03/2024
 */
public class BookFactory {

    public static Book buildBook(String bookID, String title, String author, String genre, double price
            , int stockQuant){
        if(Helper.isNullOrEmpty(bookID) || Helper.isNullOrEmpty(title) || Helper.isNullOrEmpty(author)
                || Helper.isNullOrEmpty(genre) || Helper.isNegative(price) || Helper.isNegative(stockQuant) )
            return null;

        return new Book.Builder().setBookId(bookID).setTitle(title).setAuthor(author).setGenre(genre)
                .setPrice(price).setStockQaunt(stockQuant).build();
    }

    public static Book buildBook(String title, String author, String genre, double price, int stockQuant){
        if(Helper.isNullOrEmpty(title) || Helper.isNullOrEmpty(author) || Helper.isNullOrEmpty(genre)
                || Helper.isNegative(price) || Helper.isNegative(stockQuant) )
            return null;

        String bookNum = Helper.generateID();

        return new Book.Builder().setBookId(bookNum).setTitle(title).setAuthor(author).setGenre(genre)
                .setPrice(price).setStockQaunt(stockQuant).build();
    }


}
