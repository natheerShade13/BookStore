package za.ac.cput.repository;

import za.ac.cput.domain.Book;

import java.util.ArrayList;
import java.util.List;

/*
BookRepository.java
Book Repository class
Author: Natheer Shade 217159109
https://github.com/natheerShade13
Date: 13/03/2024
 */

public class BookRepository implements IBookRepository{

    private static IBookRepository repository = null;

    private List<Book> booksList;

    private BookRepository(){
        booksList = new ArrayList<Book>();
    }

    public static IBookRepository getRepository(){
        if(repository == null)
            repository = new BookRepository();

        return repository;
    }

    @Override
    public List<Book> getAll() {

        return booksList;
    }

    @Override
    public Book create(Book book) {
        boolean success = booksList.add(book);
        if(success){
            return book;
        }
        return null;
    }

    @Override
    public Book read(String s) {
        for(Book e : booksList){
            if(e.getBookID().equals(s))
                return e;
        }
        return null;
    }

    @Override
    public Book update(Book book) {
        String id = book.getBookID();
        Book bookOld = read(id);

        if(bookOld == null){
            return null;
        }
        boolean success = delete(id);
        if(success){
            booksList.add(book);
            return book;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        Book bookToDelete = read(s);
        if(bookToDelete == null){
            return false;
        }
        return (booksList.remove(bookToDelete));
    }
}
