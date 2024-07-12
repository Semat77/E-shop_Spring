package pl.eshoping.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.eshoping.Model.Product;
import pl.eshoping.Repository.ProductRepository;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/rest/products")
    public List<Product> getProducts() {
        return productRepository.findAll();
    }
}
