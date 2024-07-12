package pl.eshoping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.eshoping.Model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
