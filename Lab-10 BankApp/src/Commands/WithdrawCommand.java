package Commands;
import App.Bank;

public class WithdrawCommand implements ICommand{
    private Bank bank;
    private String accountNumber;
    private double amount;

    public WithdrawCommand(Bank bank, String accountNumber, double amount){
        this.bank = bank;
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    @Override
    public void Execute() {
        bank.Withdraw(accountNumber, amount);
    }

    @Override
    public void Signature() {
        System.out.println("Withdrew " + amount + " to Account " + accountNumber);
    }
}
