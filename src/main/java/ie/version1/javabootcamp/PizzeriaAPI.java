package ie.version1.javabootcamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * Created by s.dobrovolschi on 11/12/2017.
 */
@RestController
public class PizzeriaAPI {

    @Autowired
    private PizzaAvailability pizzaAvailability;

    @RequestMapping("/order/pizza")
    public ResponseEntity<Order> deliverOrder(
            @RequestParam(value="customer") String customer,
            @RequestParam(value="deliveryCapacity") int deliveryCapacity,  HttpServletRequest request) {
        try {
            Thread.sleep(deliveryCapacity);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String item = pizzaAvailability.consumeItem();
        if(item != null){
            String location = request.getLocalAddr();
            String pizza = PizzaType.randomPizzaType().name();
            return ResponseEntity.ok(new Order(Calendar.getInstance().getTime(), item, location, customer ));
        } else {
            return ResponseEntity.notFound().build();
        }

    }

}
