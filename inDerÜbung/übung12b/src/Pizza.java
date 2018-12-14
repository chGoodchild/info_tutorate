public class Pizza {
    public static void main(String[] args) {
        Margherita p1 = new Salami();
        Margherita p2 = new Veggy();

        String[] toppings = new String[3];
        toppings[0] = "Salami";
        toppings[1] = "Pepper";
        toppings[2] = "Hot Pepper";
        Margherita p3 = new GenericPizza(toppings);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        p1.makeLarger();
        p2.addTopping("Mushroom");

        System.out.println(p1);
        System.out.println(p2);

        // Frage: Gibt es bessere Ansaetze?

        // Ja, mann könnte alles auf Generic Pizza aufbauen statt auf
        // Margeritta auf zu bauen..
    }
}
