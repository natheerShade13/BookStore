package za.ac.cput.domain;

/*

Author: Mmabotse Christinah Mosima 221804854  1/03/2024

 */
public class Review {
    private int reviewID;
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
    public int getReviewID() {
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
        private int reviewID;
        private String bookTitle;
        private String authorName;
        private String reviewerName;
        private int rating;
        private String comment;

        public Builder() {
            this.reviewID = reviewID;
            this.bookTitle = bookTitle;
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

        public Review build() {
            return new Review(this);
        }
    }
}

