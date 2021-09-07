package tec.bd.starwars.cli;

import picocli.CommandLine;
import tec.bd.starwars.Planet;
import tec.bd.starwars.StarWarsService;

import java.util.Optional;

@CommandLine.Command(name = "planet", description = "Get star wars planet information")
public class PlanetCommand implements Runnable {

    private  static StarWarsService starWarsService = new StarWarsService();

    @CommandLine.Parameters(paramLabel = "<planet id>", description = "id to be resolved")
    private String id;

    @Override
    public void run() {

        Optional<Planet> reportPlanet = starWarsService.getPlanet(id);
        System.out.println(reportPlanet);
    }
}
