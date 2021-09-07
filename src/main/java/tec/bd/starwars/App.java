package tec.bd.starwars;

import picocli.CommandLine;
import tec.bd.starwars.cli.MainCommand;


public class App
{
    public static void main( String[] args )
    {

        CommandLine cmd = new CommandLine(new MainCommand());
        cmd.setExecutionStrategy(new CommandLine.RunAll()); // default is RunLast
        cmd.execute(args);

        if (args.length == 0) { cmd.usage(System.out); }
    }
}
