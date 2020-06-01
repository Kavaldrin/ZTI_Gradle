import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.LinkedList;

public class Example_3 {
    public static void main(String[] args) {
        System.out.println("Przyklad 3");
        Movie mov1 = new Movie("W pustyni i w puszczy", "Gavin Hood", "2001");

        LinkedList<Movie> target = new LinkedList<>();
        Type listType = new TypeToken<LinkedList<Movie>>(){}.getType();
        target.add(mov1);

        Gson gson = new Gson();
        String movAsJson = gson.toJson(target, listType);
        LinkedList<Movie> target2 = gson.fromJson(movAsJson, listType);

        for(Movie mov : target2){
            System.out.println(mov.getTitle());
        }

    }
}
