public abstract class Topping implements IPizza {
    public final IPizza pizza;

    protected Topping(IPizza pizza) {
        this.pizza = pizza;
    }
}


