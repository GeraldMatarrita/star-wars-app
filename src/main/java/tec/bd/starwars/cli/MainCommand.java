package tec.bd.starwars.cli;

import picocli.CommandLine;


    @CommandLine.Command(
            name = "Star Wars Universe information",
            subcommands = {
                    PeopleCommand.class,
                    PlanetCommand.class,
                    CommandLine.HelpCommand.class},
            description = "Get information about Star Wars Universe")

    public class MainCommand implements Runnable {

        @Override
        public void run() {

        }
}
