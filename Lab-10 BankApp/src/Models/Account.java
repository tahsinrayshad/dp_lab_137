package Models;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private String AccountNumber;
    private double Balance;

    private List<Transaction> Transactions;

    public Account(String AccountNumber, double Balance){
        this.AccountNumber = AccountNumber;
        this.Balance = Balance;
        this.Transactions = new ArrayList<>();
    }

    public void Deposite(double amount){
        Balance += amount;
        Transactions.add(new Transaction("Deposite", amount));
        System.out.println("Deposited "+ amount + " to " + AccountNumber + ". New Balance: " + Balance);
    }

    public void Withdraw(double amount){
        if(amount < Balance){
            Balance -= amount;
            Transactions.add(new Transaction("Withdraw", amount));
            System.out.println("Withdrew "+ amount + " from " + AccountNumber + ". New Balance: "+ Balance);
        }
        else{
            System.out.println("Can not withdraw! Insufficient Balance.");
        }
    }

    public double getBalance(){
        return this.Balance;
    }

    public List<Transaction> getTransactions(){
        return this.Transactions;
    }
}
