package za.ac.cput.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Review;
import za.ac.cput.domain.Review.Builder;
import za.ac.cput.factory.ReviewFactory;

    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    class ReviewRepositoryTest {

        private static IReviewRepository repository = ReviewRepository.getRepository();

        private Review review1 = ReviewFactory.createBookReview("Jujutsu Kaisen", "Natheer", "John Doe", 5, "A thrilling manga series.");

        @Test
        @Order(4)
        void getAll() {
            System.out.println(repository.getAll());
        }

        @Test
        @Order(1)
        void create() {
            Review add = repository.create(review1);
            assertNotNull(add);
            System.out.println(add);
        }

        @Test
        @Order(2)
        void read() {
            int reviewID = review1.getReviewID();
            Review read = repository.read(reviewID);
            assertNotNull(read);
            System.out.println(read);
        }

        @Test
        @Order(3)
        void update() {
            Review newReview = new Review.Builder().copy(review1).setRating(4).build();
            Review update = repository.update(newReview);
            assertNotNull(update);
            System.out.println(update);
        }

        @Test
        @Order(5)
        void delete() {
            assertTrue(repository.delete(review1.getReviewID()));
            System.out.println("Successfully deleted");
        }
    }
