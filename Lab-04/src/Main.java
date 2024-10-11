import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to IUTBeans \n\n");

        BevFactory bevFactory = new BevFactory();
        CondFactory condFactory = new CondFactory();

        bevFactory.signature();
        System.out.println("\n\nEnter the drink you want: ");
        Scanner scanner = new Scanner(System.in);

        String bevType = scanner.nextLine();
        IBeverage beverage = bevFactory.getBeverage(bevType);

        double cost = beverage.getPrice();

        condFactory.signature();
        System.out.println("\n\nEnter the condiment you want: ");
        String condTypes = scanner.nextLine();

        int condCount = condTypes.length();

        ICondiments condiment;

        for(int i=0; i<condCount; i++) {
            String condType = String.valueOf(condTypes.charAt(i));
            condiment = condFactory.getCondiments(condType);
            cost += condiment.getCost();
        }

        System.out.println("\n\nYour order is: " + beverage.getDescription() + "\n");
        System.out.println("Your condiments are: "  + "\n");
        condFactory.printCondiments(condCount);
        System.out.println("\n\nYour total cost is: " + cost);

    }
}