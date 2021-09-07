package tec.bd.starwars;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.Optional;

public class StarWarsService {

    public Optional <People> getPeople(String id){
        try {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://swapi.dev/api/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

                StarWarsAPI starWarsAPI = retrofit.create(StarWarsAPI.class);
               return Optional.ofNullable(starWarsAPI.people(id).execute().body());

        } catch (Exception e) {
        e.printStackTrace();
        }
        return Optional.empty();
    }

    public Optional <Planet> getPlanet(String id){
        try {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://swapi.dev/api/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            StarWarsAPI starWarsAPI = retrofit.create(StarWarsAPI.class);
            return Optional.ofNullable(starWarsAPI.planet(id).execute().body());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }
}