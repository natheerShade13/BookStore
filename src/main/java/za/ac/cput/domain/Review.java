package za.ac.cput.domain;
import java.util.Objects;

/*
Review.java
Review model class
Author: Mmabotse Christinah Mosima (221804854)
Date: 15/03/2024
Git url: https://github.com/221804854-mmabotse-christinah
 */
public class Review {
    private String reviewID;
    private String bookTitle;
    private String authorName;
    private String reviewerName;
    private int rating;
    private String comment;

    private Review(Builder builder) {
        this.reviewID = builder.reviewID;
        this.bookTitle = builder.bookTitle;
        this.authorName = builder.authorName;
        this.reviewerName = builder.reviewerName;
        this.rating = builder.rating;
        this.comment = builder.comment;
    }

    // Getters
    public String getreviewID() {
        return reviewID;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Review review = (Review) o;
        return Objects.equals(reviewID, review.reviewID) && Objects.equals(bookTitle, review.bookTitle) && Objects.equals(authorName, review.authorName) && Objects.equals(reviewerName, review.reviewerName) && Objects.equals(rating, review.rating) && Objects.equals(comment, review.comment);
    }
    @Override
    public int hashCode() {
        return Objects.hash(reviewID, bookTitle, authorName, reviewerName, rating, comment);
    }

    // toString method
    @Override
    public String toString() {
        return "Book Review:\n" +
                "Review ID: " + reviewID + '\n' +
                "Title: " + bookTitle + '\n' +
                "Author: " + authorName + '\n' +
                "Reviewer: " + reviewerName + '\n' +
                "Rating: " + rating + '\n' +
                "Comment: " + comment;
    }

    // Builder class
    public static class Builder {
        private String reviewID;;
        private String bookTitle;
        private String authorName;
        private String reviewerName;
        private int rating;
        private String comment;

        public Builder setreviewID(String reviewID) {
            this.reviewID = reviewID;
            return this;
        }

        public Builder setbookTitle(String bookTitle) {
            this.bookTitle = bookTitle;
            return this;
        }

        public Builder setAuthorName(String authorName) {
            this.authorName = authorName;
            return this;
        }

        public Builder setReviewerName(String reviewerName) {
            this.reviewerName = reviewerName;
            return this;
        }

        public Builder setRating(int rating) {
            this.rating = rating;
            return this;
        }

        public Builder setComment(String comment) {
            this.comment = comment;
            return this;
        }

        public Review.Builder copy(Review review) {
            this.reviewID = review.reviewID;
            this.bookTitle = review.bookTitle;
            this.authorName = review.authorName;
            this.reviewerName = review.reviewerName;
            this.rating = review.rating;
            this.comment = review.comment;
            return this;
        }
        public Review build() {
            return new Review(this);
        }
    }
}



