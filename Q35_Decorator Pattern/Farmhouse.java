public class Farmhouse implements IPizza {
    @Override
    public String getDescription() {
        return "I am simple Farmhouse pizza";
    }

    @Override
    public int getPrice() {
        return 11;
    }
}
