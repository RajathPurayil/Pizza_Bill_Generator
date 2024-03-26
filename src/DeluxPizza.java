public class DeluxPizza extends Pizza{

    public DeluxPizza(Boolean veg){

        super(veg);
        super.addExtraCheese();
        super.addExtraToppings();

    }

    public DeluxPizza(boolean veg) {
        super(veg);
    }

    @Override
    public void addExtraCheese() {

    }

    @Override
    public void addExtraToppings() {

    }
}
