public class Main {
    public static void main(String[] args) {
        IPizza myPizza = new Pepperoni();
        System.out.println("The price of " + myPizza.getDescription() + " is " + myPizza.getPrice());
        //Should print : The price of Pepperoni pizza is 10

        myPizza = new JalapenoTopping(myPizza);
        System.out.println("The price of " + myPizza.getDescription() + " is " + myPizza.getPrice());
        //Should print : The price of Pepperoni pizza with Jalapeño is 14

        myPizza = new JalapenoTopping(myPizza);
        System.out.println("The price of " + myPizza.getDescription() + " is " + myPizza.getPrice());
        //Should print : The price of Pepperoni pizza with Jalapeño is 18

        myPizza = new BBQ_Topping(myPizza);
        System.out.println("The price of " + myPizza.getDescription() + " is " + myPizza.getPrice());
        //Should print : The price of Pepperoni pizza with Jalapeño with BBQ is 23
    }
}