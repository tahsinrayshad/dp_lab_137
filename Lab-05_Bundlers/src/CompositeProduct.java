import java.util.ArrayList;
import java.util.List;

public abstract class CompositeProduct implements IProduct{
    private double discount;

    public CompositeProduct(double discount){
        this.discount = discount;
    }
    public List<IProduct> products = new ArrayList<>();

    public List<IProduct> getProducts(){
        return products;
    }

    public void addProduct(IProduct product){
        products.add(product);
    }

    public abstract void build();

    public double getPrice(){
        double price = 0;
        for(IProduct product : products){
            price += product.getPrice();
        }

        return price-discount;
    }

    public String getName(){
        String name = "";
        for(IProduct product : products){
            name += product.getName() + ", ";
        }

        return name;
    }

    public String getDescription(){
        String description = "";
        for(IProduct product : products){
            description += product.getDescription() + ", ";
        }

        return description;
    }
}
