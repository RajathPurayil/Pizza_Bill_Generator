public class Main {
    public static void main(String[] args) {
    //   Pizza basePizza= new Pizza(false);
/*
      basePizza.addExtraToppings();
      basePizza.addExtraCheese();
      basePizza.takeAway();
      basePizza.getBill();
*/

        DeluxPizza dp= new DeluxPizza(true);
        dp.addExtraToppings();
        dp.addExtraCheese();
        dp.getBill();
        dp.takeAway();

    }
}