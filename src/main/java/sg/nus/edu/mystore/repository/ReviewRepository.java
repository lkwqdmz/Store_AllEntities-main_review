package sg.nus.edu.mystore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sg.nus.edu.mystore.entity.Review;
import sg.nus.edu.mystore.entity.Order_Product;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
    // 根据评分获取评论
    List<Review> findByRating(double rating);

    // 根据指定订单获取评论
    List<Review> findByOrder_Product(Order_Product orderProduct);

    // 根据评论内容包含特定关键字查找评论
    List<Review> findByCommentContaining(String keyword);

    // 根据评分范围获取评论
    List<Review> findByRatingBetween(double minRating, double maxRating);
}
