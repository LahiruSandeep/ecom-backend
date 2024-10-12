package lk.icet.ecom.service;

import lk.icet.ecom.service.impl.ProductServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = ProductServiceTest.class)
public class ProductServiceTest {

    ProductService productService = new ProductServiceImpl();

    @Test
    void test_evaluateProductRating_when90Likes(){
        String ratingComment = productService.evaluateProductRating(90);
        Assertions.assertEquals("Liked Product",ratingComment);
    }

    @Test
    void test_evaluateProductRating_when30Likes(){
        String ratingComment = productService.evaluateProductRating(30);
        Assertions.assertEquals("Standard Product",ratingComment);
    }

}
