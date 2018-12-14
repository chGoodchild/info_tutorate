class Margherita {
    public Margherita() {
        this.name = "Margherita";
        this.price = 5.0;
        this.toppings = new String[2];
        this.toppings[0] = "Tomato";
        this.toppings[1] = "Cheese";
    }

    public void makeLarger() {
        this.price++;
        this.size++;
    }

    public double costs() {
        return this.price;
    }

    public void addTopping(String topping) {
        String[] newString = new String[toppings.length + 1];
        for (int i = 0; i < toppings.length; i++) {
            newString[i] = toppings[i];
        }

        newString[newString.length - 1] = topping;
        this.toppings = newString;
    }

    public String toString() {
        String output = "";
        output += ("This " + name + " has ");
        for (int i = 0; i < toppings.length - 1; i++) {
            output += (toppings[i] + ", ");
        }
        output += (toppings[toppings.length - 1]);
        output += (" and it costs " + this.price);
        return output;
    }

    String name;
    double price;
    String[] toppings;
    int size = 1;
}
