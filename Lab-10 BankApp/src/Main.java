import App.Bank;
import Commands.CreateCommand;
import Commands.DepositeCommand;
import Executor.CommandExecutor;
import Executor.QueryExecutor;
import Queries.ShowTransactionHistoryQuery;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Bank!");

        Bank ABBank = new Bank();
        CommandExecutor commandExecutor = new CommandExecutor();
        QueryExecutor queryExecutor = new QueryExecutor();

        // Create First Account
        CreateCommand createCommand1 = new CreateCommand(ABBank, "ABC", 100);
        commandExecutor.ExecuteCommand(createCommand1);

        // Create Second Account
        CreateCommand createCommand2 = new CreateCommand(ABBank, "XYZ", 500);
        commandExecutor.ExecuteCommand(createCommand2);

        // Deposit 50 taka to first account
        DepositeCommand depositeCommand = new DepositeCommand(ABBank, "ABC", 50);
        commandExecutor.ExecuteCommand(depositeCommand);

        // Transcaction History of first account
        ShowTransactionHistoryQuery showTransactionHistoryQuery = new ShowTransactionHistoryQuery(ABBank, "ABC");
        queryExecutor.ExecuteQuery(showTransactionHistoryQuery);

        commandExecutor.CommandHistory();


    }
}