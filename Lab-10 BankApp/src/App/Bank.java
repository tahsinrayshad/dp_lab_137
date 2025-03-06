package App;

import Models.Account;
import Models.Transaction;


import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, Account> accounts = new HashMap<>();

    public void CreateAccount(String accountNumber, double initialDeposite){
        if(!accounts.containsKey(accountNumber)){
            accounts.put(accountNumber, new Account(accountNumber, initialDeposite));
            System.out.println("New Account "+ accountNumber + " created with inital balance " + initialDeposite);
        }
        else {
            System.out.println("Accounte Number already exists. Try using different number!");
        }
    }

    public void Deposite(String accountNumber, double amount){
        Account account = accounts.get(accountNumber);
        if (account != null){
            account.Deposite(amount);
        }
        else {
            System.out.println("Account not Found");
        }
    }

    public void Withdraw(String accountNumber, double amount){
        Account account = accounts.get(accountNumber);
        if (account != null){
            account.Withdraw(amount);
        }
        else {
            System.out.println("Account not Found");
        }
    }

    public void ShowBalance(String accountNumber){
        Account account = accounts.get(accountNumber);
        if (account != null){
            System.out.println("Balance of "+ accountNumber + "is : " + account.getBalance());
        }
        else {
            System.out.println("Account not Found");
        }
    }

    public void ShowTransaction(String accountNumber){
        Account account = accounts.get(accountNumber);
        if (account != null){
            System.out.println("\nTransaction History of Account "+accountNumber+":\n");
            for (Transaction transaction : account.getTransactions()){
                System.out.println(transaction.getDate() + ": "+ transaction.getType() + " - " + transaction.getAmount());
            }
        }
        else {
            System.out.println("Account not found!");
        }
    }

}
