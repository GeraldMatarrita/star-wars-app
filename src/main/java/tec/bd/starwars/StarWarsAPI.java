package tec.bd.starwars;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;


import java.util.Map;

public interface StarWarsAPI {

    @GET("people/{id}")
    Call<People> people(@Path("id") String id);

    @GET("planets/{id}")
    Call<Planet> planet(@Path("id") String id);
}
