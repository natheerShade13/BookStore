package za.ac.cput.domain;

import java.util.Objects;

/*

Author: Natheer Shade 217159109 13/03/2024

 */
public class Book {

    private final String bookID;
    private final String title;
    private final String author;
    private final String genre;
    private final int price;
    private final int stockQaunt;

    public Book(Builder builder){
        this.bookID = builder.bookID;
        this.title = builder.title;
        this.author = builder.author;
        this.genre = builder.genre;
        this.price = builder.price;
        this.stockQaunt = builder.stockQaunt;


    }

    public String bookID() {
        return bookID;
    }

    public String title() {
        return title;
    }

    public String author() {
        return author;
    }

    public String genre() {
        return genre;
    }

    public int price() {
        return price;
    }

    public int stockQaunt() {
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
        private int price;
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

        public Builder setPrice(int price) {
            this.price = price;
            return this;
        }

        public Builder setStockQaunt(int stockQaunt) {
            this.stockQaunt = stockQaunt;
            return this;
        }

        public Book build(){
            return new Book(this);
        }
    }
}
