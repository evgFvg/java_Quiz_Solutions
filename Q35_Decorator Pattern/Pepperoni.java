public class Pepperoni implements IPizza {

    @Override
    public String getDescription() {
        return "I am simple Pepperoni pizza";
    }

    @Override
    public int getPrice() {
        return 10;
    }
}
