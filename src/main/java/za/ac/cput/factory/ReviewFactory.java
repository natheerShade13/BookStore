package za.ac.cput.factory;

import za.ac.cput.domain.Review;
import za.ac.cput.util.Helper;

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
    }

