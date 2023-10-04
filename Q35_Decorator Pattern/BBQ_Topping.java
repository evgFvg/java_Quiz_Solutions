public class BBQ_Topping extends Topping{
    public BBQ_Topping(IPizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + BBQ topping";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 5;
    }
}
