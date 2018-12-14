class GenericPizza extends Margherita {
    public GenericPizza(String[] top) {
        this.toppings = top;
        this.price = 4 + (top.length) / 2;
        this.name = "Generic Pizza";
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
