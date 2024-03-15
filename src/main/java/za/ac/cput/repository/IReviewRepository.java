package za.ac.cput.repository;

import za.ac.cput.domain.Review;

import java.util.List;

public interface IReviewRepository extends IRepository<Review, String>{

    List<Review> getAll();

    Review create(Review review1);
    Review read(String reviewID);

    Review update(Review newReview);

    boolean delete(String reviewID);

    List<Review> getall();
}
