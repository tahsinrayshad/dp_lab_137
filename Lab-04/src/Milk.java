public class Milk implements ICondiments{
    private String name = "Milk";
    private double cost = 0.20;

    private ICondiments condiment;

    public Milk(ICondiments condiment) {
        this.condiment = condiment;
    }

    @Override
    public String getDescription() {
        return this.name+", "+condiment.getDescription();
    }

    @Override
    public double getCost() {
        return this.cost+condiment.getCost();
    }
}
