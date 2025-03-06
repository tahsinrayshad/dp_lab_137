package Queries;

import App.Bank;

public class ShowBalanceQuery implements IQuery {
    private Bank bank;
    private String accountnumber;

    public ShowBalanceQuery(Bank bank, String accountnumber){
        this.bank = bank;
        this.accountnumber = accountnumber;
    }

    public void Query(){
        bank.ShowBalance(accountnumber);
    }
}
