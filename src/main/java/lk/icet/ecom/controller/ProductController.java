package lk.icet.ecom.controller;

import lk.icet.ecom.model.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @PostMapping("/save-product")
    public Product saveProduct(@RequestBody Product product){
        return null;
    }
}
