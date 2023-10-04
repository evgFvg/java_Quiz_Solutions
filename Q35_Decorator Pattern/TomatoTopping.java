public class TomatoTopping extends Topping{
    public TomatoTopping(IPizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " Tomato topping";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 1;
    }
}
