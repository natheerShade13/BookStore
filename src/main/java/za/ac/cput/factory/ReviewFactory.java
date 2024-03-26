package za.ac.cput.factory;

import za.ac.cput.domain.Review;
import za.ac.cput.util.Helper;

import static za.ac.cput.util.Helper.generateID;

/*
Review.java
Review model class
Author: Mmabotse Christinah Mosima (221804854)
Date: 15/03/2024
Git url: https://github.com/221804854-mmabotse-christinah
 */
public class ReviewFactory {


    public static Review createBookReview(String reviewID, String bookTitle, String authorName, String reviewerName, int rating, String comment) {
        if (Helper.isNullOrEmpty(reviewID) || Helper.isNullOrEmpty(bookTitle) || Helper.isNullOrEmpty(authorName) || Helper.isNullOrEmpty(reviewerName)
                || Helper.isNegative(rating) || Helper.isNullOrEmpty(comment)) {
            return null;
        }

        return new Review.Builder()
                .setreviewID(reviewID)
                .setbookTitle(bookTitle)
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

        String generatedReviewID = Helper.generateID();

        return new Review.Builder()
                .setreviewID(generatedReviewID)
                .setbookTitle(bookTitle)
                .setAuthorName(authorName)
                .setReviewerName(reviewerName)
                .setRating(rating)
                .setComment(comment)
                .build();
    }
}

