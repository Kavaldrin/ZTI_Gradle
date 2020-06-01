package lib_example;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class Converter {

    ArrayList<Movie> fromJSON(String jsonString){
        Gson gson = new Gson();
        ArrayList<Movie> result = new ArrayList<>();
        Type listType = new TypeToken<ArrayList<Movie>>(){}.getType();
        return gson.fromJson(jsonString, listType);
    }

    String toJSON(ArrayList<Movie> movies) {
        Movie mov = new Movie("W pustyni i w puszczy", "Gavin Hood", "2001");
        Type listType = new TypeToken<ArrayList<Movie>>() {
        }.getType();
        Gson gson = new Gson();
        return gson.toJson(movies, listType);
    }

}
