class Salami extends Margherita {
    public Salami() {
        this.price = 5.5;
        this.toppings = new String[3];
        this.name = "Pizza Salami";
        toppings[0] = "tomato";
        toppings[1] = "cheese";
        toppings[2] = "salami";
    }

    public void addTopping(String topping) {
        String[] newString = new String[toppings.length + 1];
        for (int i = 0; i < toppings.length; i++) {
            newString[i] = toppings[i];
        }

        newString[newString.length - 1] = topping;
        this.toppings = newString;

        // NEW:
        this.price = this.price + 0.5;
    }
}
