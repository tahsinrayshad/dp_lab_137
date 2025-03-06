package Executor;

import Commands.ICommand;

import java.util.ArrayList;
import java.util.List;

public class CommandExecutor {
    private List<ICommand> commands = new ArrayList<>();
    
    public void ExecuteCommand(ICommand command){
        commands.add(command);
        command.Execute();
    }
    
    public void CommandHistory(){
        System.out.println("\nCommand History");
        for (ICommand cmd : commands) {
            cmd.Signature();
        }
    }
}
