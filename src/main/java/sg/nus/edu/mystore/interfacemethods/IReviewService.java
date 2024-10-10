package sg.nus.edu.mystore.interfacemethods;

import sg.nus.edu.mystore.entity.Review;

import java.util.List;

public interface IReviewService {
    List<Review> getAllReviews();
    Review getReviewById(Integer id);
    Review addReview(Review review);
    Review updateReview(Integer id, Review reviewDetails);
    void deleteReview(Integer id);
}
