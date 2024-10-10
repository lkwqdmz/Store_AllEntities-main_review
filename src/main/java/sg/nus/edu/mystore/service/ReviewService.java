package sg.nus.edu.mystore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sg.nus.edu.mystore.entity.Review;
import sg.nus.edu.mystore.repository.ReviewRepository;
import sg.nus.edu.mystore.interfacemethods.IReviewService;

import java.util.List;

@Service
public class ReviewService implements IReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Override
    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    @Override
    public Review getReviewById(Integer id) {
        return reviewRepository.findById(id).orElse(null);
    }

    @Override
    public Review addReview(Review review) {
        return reviewRepository.save(review);
    }

    @Override
    public Review updateReview(Integer id, Review reviewDetails) {
        Review review = reviewRepository.findById(id).orElse(null);
        if (review != null) {
            review.setRating(reviewDetails.getRating());
            review.setComment(reviewDetails.getComment());
            review.setOrder_product(reviewDetails.getOrder_product());
            return reviewRepository.save(review);
        }
        return null;
    }

    @Override
    public void deleteReview(Integer id) {
        reviewRepository.deleteById(id);
    }
}
