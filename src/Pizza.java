public class Pizza {
    private  int price;
    private boolean veg;

    private int extraCheesePrice=100;
    private int ExtraToppingsPrice=150;

    private  int backPackPrice=20;


    public Pizza(boolean veg){

        this.veg=veg;
        if (this.veg){

            this.price=300;
        }else {

            this.price=400;
        }

    }

  public  void addExtraCheese(){
        System.out.println("Extra Cheese Aaded");
        this.price+=100;

  }

  public  void addExtraToppings(){


        System.out.println("Extra toppings added");
        this.price+=extraCheesePrice;
  }

  public void takeAway(){
System.out.println("Takeaway opted");
this.price+=backPackPrice;

  }


    public  void getBill(){

        System.out.println(this.price);
        String bill="";


  }
}




