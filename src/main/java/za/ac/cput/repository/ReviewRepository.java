package za.ac.cput.repository;

import za.ac.cput.domain.Review;
import java.util.ArrayList;
import java.util.List;

/*
Author: Mmabotse Christinah Mosima 221804854 15/03/2024
 */

public class ReviewRepository implements IReviewRepository {

    private static IReviewRepository repository = null;

    private final List<Review> reviewsList;

    private ReviewRepository() {
        reviewsList = new ArrayList<Review>();
    }

    public static IReviewRepository getRepository() {
        if (repository == null) {
            repository = new ReviewRepository();
        }
        return repository;
    }

    @Override
    public List<Review> getAll() {
        return reviewsList;
    }

    @Override
    public Review create(Review review) {
        boolean success = reviewsList.add(review);
        if (success) {
            return review;
        }
        return null;
    }

    @Override
    public Review read(String reviewID) {
        for (Review review : reviewsList) {
            if (review.getreviewID().equals(reviewID)) {
                return review;
            }
        }
        return null;
    }

    @Override
    public Review update(Review review) {
        String reviewID = review.getreviewID();
        Review oldReview = read(reviewID);

        if (oldReview == null) {
            return null;
        }

        boolean success = delete(reviewID);
        if (success) {
            reviewsList.add(review);
            return review;
        }
        return null;
    }

    @Override
    public boolean delete(String reviewID) {
        Review reviewToDelete = read(reviewID);
        if (reviewToDelete == null) {
            return false;
        }
        return reviewsList.remove(reviewToDelete);
    }

    @Override
    public List<Review> getall() { return reviewsList;}
}