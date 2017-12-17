package ie.version1.javabootcamp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by s.dobrovolschi on 16/12/2017.
 */
public enum PizzaType {
        MARGHERITA,
        HAM_PEPERONI,
        DIAVOLA,
        ROMANA,
        NAPOLI;

        private static final List<PizzaType> VALUES =
                Collections.unmodifiableList(Arrays.asList(values()));
        private static final int SIZE = VALUES.size();
        private static final Random RANDOM = new Random();

        public static PizzaType randomPizzaType()  {
            return VALUES.get(RANDOM.nextInt(SIZE));
        }
}
