import java.util.HashMap;
import java.util.Map;

public class BevFactory {
    private Map<String, IBeverage> beverageMap= new HashMap<>();

    public BevFactory() {
        beverageMap.put("1", new Cappuccino());
        beverageMap.put("2", new Espresso());
        beverageMap.put("3", new Latte());
    }

    public IBeverage getBeverage(String bevType) {
        return beverageMap.get(bevType);
    }

    public void signature() {
        String Signature = "Write the followings to get the beverages: \n"
                + "1 for Cappuccino\n"
                + "2 for Espresso\n"
                + "3 for Latte\n";

        System.out.println(Signature);
    }
}
