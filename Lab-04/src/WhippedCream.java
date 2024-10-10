public class WhippedCream implements ICondiments{
    private String name = "Whipped Cream";
    private double cost = 0.50;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCost() {
        return cost;
    }
}
