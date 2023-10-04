public class JalapenoTopping extends Topping{
    public JalapenoTopping(IPizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Jalapeno topping";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 4;
    }
}
