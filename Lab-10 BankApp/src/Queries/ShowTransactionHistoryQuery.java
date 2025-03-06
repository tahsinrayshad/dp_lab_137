package Queries;

import App.Bank;

public class ShowTransactionHistoryQuery implements IQuery{

    private Bank bank;
    private String accountNumber;

    public ShowTransactionHistoryQuery(Bank bank, String accountNumber){
        this.bank = bank;
         this.accountNumber = accountNumber;
    }

    @Override
    public void Query() {
        bank.ShowTransaction(accountNumber);

    }
}
