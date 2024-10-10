public class Milk implements ICondiments{
    private String name = "Milk";
    private double cost = 0.20;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCost() {
        return cost;
    }
}
