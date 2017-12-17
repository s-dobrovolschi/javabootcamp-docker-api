package ie.version1.javabootcamp;

import java.util.Date;

/**
 * Created by s.dobrovolschi on 11/12/2017.
 */
public class Order {

    private Date timestamp;
    private String pizza;
    private String location;
    private String customer;

    public Order(Date timestamp, String pizza, String location, String customer) {
        this.timestamp = timestamp;
        this.pizza = pizza;
        this.location = location;
        this.customer = customer;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getPizza() {
        return pizza;
    }

    public void setPizza(String pizza) {
        this.pizza = pizza;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
}
