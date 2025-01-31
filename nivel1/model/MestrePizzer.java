package nivel1.model;

public class MestrePizzer {

    public void makeHawaiianaPizza(PizzaBuilder builder) {
        builder.setSize("Mediana")
                .setDough("Suave").addTopping("Jamón")
                .setDough("Suave").addTopping("Piña");
    }

    public void makeVegetarianPizza(PizzaBuilder builder) {
        builder.setSize("Pequeña")
                .setDough("Integral")
                .addTopping("Berenjena")
                .addTopping("Olivas")
                .addTopping("Champiñones");
    }
}
