package za.ac.cput.factory;


import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Review;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/*

Author: Mmabotse Christinah Mosima 221804854 15/03/2024
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ReviewFactoryTest {

    @Test
    @Order(1)
    void CreateBookReview() {
        Review review1 = ReviewFactory.createBookReview("JB122345", "IT ENDS WITH US", "Colleen Hoover", "James Tom", 5, "good book");
        assertNotNull(review1);
        System.out.println(review1.toString());
    }

    @Test
    @Order(1)
    void buildBookReviewWithFail() {
        Review review2 = ReviewFactory.createBookReview("B12345", "IT ENDS WITH US", "Colleen Hoover", "James Tom", 5, "good book");
        assertNotNull(review2);
        System.out.println(review2.toString());
    }
}