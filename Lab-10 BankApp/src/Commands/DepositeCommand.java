package Commands;
import App.Bank;


public class DepositeCommand implements ICommand{

    private Bank bank;
    private String accountNumber;
    private double amount;

    public DepositeCommand(Bank bank, String accountNumber, double amount){
        this.bank = bank;
        this.accountNumber = accountNumber;
        this.amount = amount;
    }


    @Override
    public void Execute() {
        bank.Deposite(accountNumber, amount);
    }

    @Override
    public void Signature() {
        System.out.println("Deposited " + amount + " to Account " + accountNumber);
    }
}
