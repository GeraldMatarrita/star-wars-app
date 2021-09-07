package tec.bd.starwars.cli;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import tec.bd.starwars.People;
import tec.bd.starwars.StarWarsService;

import java.util.Optional;

@Command(name = "people", description = "Get star wars people information")
public class PeopleCommand implements Runnable {

    private  static StarWarsService starWarsService = new StarWarsService();

    @CommandLine.Parameters(paramLabel = "<people id>", description = "id to be resolved")
    private String id;

    @Override
    public void run() {

        Optional<People> reportPeople = starWarsService.getPeople(id);
        System.out.println(reportPeople);
        }
}
