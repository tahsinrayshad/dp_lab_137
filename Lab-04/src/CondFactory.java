import java.util.HashMap;
import java.util.Map;

public class CondFactory
{
    private Map<String, ICondiments> conds = new HashMap<>();

    public CondFactory() {
        conds.put("1", new Milk(new WhiteSugar(new WhippedCream(new Blank()))));
        conds.put("2", new WhiteSugar(new WhiteSugar(new Milk(new Blank()))));
        conds.put("3", new WhippedCream(new Milk(new Milk(new Blank()))));
    }

    public ICondiments getCondiments(String condType) {
        return conds.get(condType);
    }

    public void signature() {
        String Signature = "Write the followings to get the condiments: \n"
                + "1 for Milk + white sugar + Whipped Cream\n"
                + "2 for WhiteSugar * 2 + milk\n"
                + "3 for WhippedCream + milk * 2\n";

        System.out.println(Signature);
    }

    public void printCondiments(int condNumber){
        if(condNumber == 1){
            System.out.println("Milk + white sugar + Whipped Cream");
        }
        else if(condNumber == 2){
            System.out.println("WhiteSugar * 2 + milk");
        }
        else if(condNumber == 3){
            System.out.println("WhippedCream + milk * 2");
        }
    }
}
