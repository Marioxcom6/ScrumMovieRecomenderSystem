package movieRecommender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Lista de películas
        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie(
                1,
                "Inception",
                "Sueños dentro de sueños",
                Genre.SCI_FI,
                Arrays.asList("Leonardo DiCaprio", "Joseph Gordon-Levitt"),
                "Christopher Nolan",
                2010
        ));

        movies.add(new Movie(
                2,
                "Titanic",
                "Romance en un barco",
                Genre.ROMANCE,
                Arrays.asList("Leonardo DiCaprio", "Kate Winslet"),
                "James Cameron",
                1997
        ));

        movies.add(new Movie(
                3,
                "Interstellar",
                "Viaje espacial",
                Genre.SCI_FI,
                Arrays.asList("Matthew McConaughey", "Anne Hathaway"),
                "Christopher Nolan",
                2014
        ));

        // Preferencias del usuario
        UserPreference userPreference = new UserPreference(
                "Leonardo DiCaprio",
                Genre.SCI_FI,
                "Christopher Nolan",
                2000,
                2010
        );

        // Lista donde se guardan resultados
        List<String> moviesShowable = new ArrayList<>();

        // Recomendador
        MovieRecommender recommender = new MovieRecommender(userPreference, moviesShowable);

        // Ejecutar filtros
        recommender.getUserFavoriteActorMovies(movies);


        // Mostrar resultados
        System.out.println("\nPelículas recomendadas:");
        for (String movie : moviesShowable) {
            System.out.println(movie);
        }
    }
}