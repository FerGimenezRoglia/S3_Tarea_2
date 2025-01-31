package nivel1;

import nivel1.model.BasicPizzaBuilder;
import nivel1.model.MestrePizzer;
import nivel1.model.Pizza;
import nivel1.model.PizzaBuilder;

public class Main {
    public static void main(String[] args) {

        MestrePizzer mestrePizzer = new MestrePizzer();
        PizzaBuilder builder = new BasicPizzaBuilder();

        mestrePizzer.makeVegetarianPizza(builder);
        Pizza vegetarian = builder.build();

        mestrePizzer.makeHawaiianaPizza(builder);
        Pizza hawaiiana = builder.build();

        System.out.println("Vegetariana: "+ vegetarian);
        System.out.println("Hawaiiana: "+ hawaiiana);


    }
}