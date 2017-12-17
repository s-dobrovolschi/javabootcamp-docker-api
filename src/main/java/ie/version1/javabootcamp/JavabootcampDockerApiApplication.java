package ie.version1.javabootcamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class JavabootcampDockerApiApplication {

    private static List<String> pizzaAvailability;

    public static void main(String[] args) {
        SpringApplication.run(JavabootcampDockerApiApplication.class, args);
    }

    @Bean
    public PizzaAvailability initPizzaAvailability() {
        return new PizzaAvailability(10);
    }

}
