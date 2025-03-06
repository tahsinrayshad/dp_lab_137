package Commands;
import App.Bank;

public class CreateCommand implements ICommand{
    private Bank bank;
    private String accountnumber;
    private double initalDeposite;

    public CreateCommand(Bank bank, String accountnumber, double initalDeposite){
        this.bank = bank;
        this.accountnumber = accountnumber;
        this.initalDeposite = initalDeposite;
    }

    @Override
    public void Execute() {
        bank.CreateAccount(accountnumber, initalDeposite);
    }

    @Override
    public void Signature() {
        System.out.println("Created bank account "+ accountnumber + " with initial deposite " + initalDeposite);
    }

}
