package za.ac.cput.factory;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Review;

import static org.junit.jupiter.api.Assertions.*;

    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    class ReviewFactoryTest {

        private final Review review1 = ReviewFactory.createBookReview("Jujutsu Kaisen", "Natheer", "John Doe", 5, "A thrilling manga series.");
        private final Review review2 = ReviewFactory.createBookReview("Solo Leveling", "Natheer", "Jane Smith", 4, "A gripping webtoon with amazing artwork.");

        @Test
        @Order(1)
        void testCreateBookReviewA() {
            assertNotNull(review1);
            System.out.println(review1);
        }

        @Test
        @Order(2)
        void testCreateBookReviewB() {
            assertNotNull(review2);
            System.out.println(review2);
        }
}