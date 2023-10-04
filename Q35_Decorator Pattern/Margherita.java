public class Margherita implements IPizza {
    @Override
    public String getDescription() {
        return "I am simple Margherita pizza";
    }

    @Override
    public int getPrice() {
        return 12;
    }
}
