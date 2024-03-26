package za.ac.cput.repository;

import za.ac.cput.domain.Review;

import java.util.List;

/*
Review.java
Review model class
Author: Mmabotse Christinah Mosima (221804854)
Date: 15/03/2024
Git url: https://github.com/221804854-mmabotse-christinah
 */
public interface IReviewRepository extends IRepository<Review, String>{

    List<Review> getAll();

}
