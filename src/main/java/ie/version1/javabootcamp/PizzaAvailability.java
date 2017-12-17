package ie.version1.javabootcamp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by s.dobrovolschi on 16/12/2017.
 */
public class PizzaAvailability {

    private List<String> items;

    public PizzaAvailability(int availability) {
        items = new ArrayList<String>();
        for (int i = 0; i <= availability ; i++){
            items.add(PizzaType.randomPizzaType().name());
        }
    }

    public String consumeItem() {
        if(items.size() > 0){
            String itemToConsume = items.get(items.size() - 1);
            items.remove(itemToConsume);
            return itemToConsume;
        } else {
            return null;
        }

    }
}
