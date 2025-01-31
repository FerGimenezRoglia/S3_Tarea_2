package nivel1.model;

import java.util.List;

public class Pizza {

        private final String size;
        private final String dough;
        private final List<String> toppings;

    public Pizza(String size, String dough, List<String> toppings) {
        this.size = size;
        this.dough = dough;
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return  "\n* Pizza " +
                "\n- Tamaño: " + size +
                "\n- Masa: " + dough +
                "\n- Ingredientes: " + toppings;
    }
}
