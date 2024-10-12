package lk.icet.ecom.service.impl;

import lk.icet.ecom.service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    public String evaluateProductRating(int numOfLikes){

        if(numOfLikes > 90) {
            return "Very Liked Product";
        }

        if(numOfLikes > 70) {
            return "Liked Product";
        }

        if(numOfLikes > 40) {
            return "Good Product";
        }

        if(numOfLikes > 10) {
            return "Standard Product";
        }
        return "Not Rated Product";
    }


}
