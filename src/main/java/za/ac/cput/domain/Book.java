package za.ac.cput.domain;

import java.util.Objects;

/*
Book.java
Book model class
Author: Natheer Shade 217159109
https://github.com/natheerShade13
Date: 13/03/2024
 */
public class Book {

    private final String bookID;
    private final String title;
    private final String author;
    private final String genre;
    private final double price;
    private final int stockQaunt;

    public Book(Builder builder){
        this.bookID = builder.bookID;
        this.title = builder.title;
        this.author = builder.author;
        this.genre = builder.genre;
        this.price = builder.price;
        this.stockQaunt = builder.stockQaunt;
    }

    public String getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQaunt() {
        return stockQaunt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return price == book.price && stockQaunt == book.stockQaunt && Objects.equals(bookID, book.bookID) && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(genre, book.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookID, title, author, genre, price, stockQaunt);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookID='" + bookID + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", price=" + price +
                ", stockQaunt=" + stockQaunt +
                '}';
    }

    public static class Builder{

        private String bookID;
        private String title;
        private String author;
        private String genre;
        private double price;
        private int stockQaunt;

        public Builder setBookId(String bookID) {
            this.bookID = bookID;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public Builder setGenre(String genre) {
            this.genre = genre;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setStockQaunt(int stockQaunt) {
            this.stockQaunt = stockQaunt;
            return this;
        }

        public Builder copy(Book book) {
            this.bookID = book.bookID;
            this.title = book.title;
            this.author = book.author;
            this.genre = book.genre;
            this.price = book.price;
            this.stockQaunt = book.stockQaunt;
            return this;
        }

        public Book build(){
            return new Book(this);
        }
    }
}
