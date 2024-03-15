package za.ac.cput.factory;

import za.ac.cput.domain.Review;
import za.ac.cput.util.Helper;

public class ReviewFactory {


        public static Review createBookReview(String bookTitle, String authorName, String reviewerName, int rating, String comment) {
            if (Helper.isNullOrEmpty(bookTitle) || Helper.isNullOrEmpty(authorName) || Helper.isNullOrEmpty(reviewerName)
                    || Helper.isNegative(rating) || Helper.isNullOrEmpty(comment)) {
                return null;
            }

            int reviewID = Helper.generateReviewID();

            return new Review.Builder()
                    .setAuthorName(authorName)
                    .setReviewerName(reviewerName)
                    .setRating(rating)
                    .setComment(comment)
                    .build();
        }
    }

