package za.ac.cput.factory;

import za.ac.cput.domain.Review;
import za.ac.cput.util.Helper;

/*

Author: Mmabotse Christinah Mosima 221804854 15/03/2024
 */
public class ReviewFactory {


    public static Review createBookReview(String reviewID,String bookTitle, String authorName, String reviewerName, int rating, String comment) {
        if (Helper.isNullOrEmpty(bookTitle) || Helper.isNullOrEmpty(authorName) || Helper.isNullOrEmpty(reviewerName)
                || Helper.isNegative(rating) || Helper.isNullOrEmpty(comment)) {
            return null;
        }

        return new Review.Builder()
                .setreviewID(reviewID)
                .setAuthorName(authorName)
                .setReviewerName(reviewerName)
                .setRating(rating)
                .setComment(comment)
                .build();
    }


    public static Review createBookReview(String bookTitle, String authorName, String reviewerName, int rating, String comment) {
        if (Helper.isNullOrEmpty(bookTitle) || Helper.isNullOrEmpty(authorName) || Helper.isNullOrEmpty(reviewerName)
                || Helper.isNegative(rating) || Helper.isNullOrEmpty(comment)) {
            return null;
        }

        String generatedReviewID = generateReviewID();

        return new Review.Builder()
                .setreviewID(generatedReviewID)
                .setbookTitle(bookTitle)
                .setAuthorName(authorName)
                .setReviewerName(reviewerName)
                .setRating(rating)
                .setComment(comment)
                .build();
    }

    private static String generateReviewID() {
        return Helper.generateID();
    }
}

