package pl.eshoping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"pl.eshoping.Model"})
@EnableJpaRepositories(basePackages = {"pl.eshoping.Repository"})
public class EShopingApplication {

    public static void main(String[] args) {
        SpringApplication.run(EShopingApplication.class, args);
    }
}
