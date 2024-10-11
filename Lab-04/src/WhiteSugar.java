public class WhiteSugar implements ICondiments{
    private String name = "White Sugar";
    private double cost = 0.25;

    private ICondiments condiment;

    public WhiteSugar(ICondiments condiment) {
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
