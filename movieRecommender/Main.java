package movieRecommender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Movie list
        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie(1, "Inception", "Sueños dentro de sueños",
                Genre.SCI_FI,
                Arrays.asList("Leonardo DiCaprio", "Joseph Gordon-Levitt"),
                "Christopher Nolan", 2010));

        movies.add(new Movie(2, "Titanic", "Romance en un barco",
                Genre.ROMANCE,
                Arrays.asList("Leonardo DiCaprio", "Kate Winslet"),
                "James Cameron", 1997));

        movies.add(new Movie(3, "Interstellar", "Viaje espacial",
                Genre.SCI_FI,
                Arrays.asList("Matthew McConaughey", "Anne Hathaway"),
                "Christopher Nolan", 2014));

        movies.add(new Movie(4, "The Dark Knight", "Batman vs Joker",
                Genre.ACTION,
                Arrays.asList("Christian Bale", "Heath Ledger"),
                "Christopher Nolan", 2008));

        // User prefers: DiCaprio, Sci-Fi, Nolan, between 2000-2014
        UserPreference userPreference = new UserPreference(
                "Leonardo DiCaprio",
                Genre.SCI_FI,
                "Christopher Nolan",
                2000,
                2014
        );

        // ✅ List<Movie> not List<String> — matches MovieRecommender
        List<Movie> moviesShowable = new ArrayList<>();
        List<Movie> favoriteMovies = new ArrayList<>();

        MovieRecommender recommender = new MovieRecommender(userPreference, moviesShowable);


        // ✅ Single call — message() handles everything internally
        recommender.message(movies);
        Favorite favorite = new Favorite(favoriteMovies);
        favorite.addMovie(moviesShowable.getFirst());
        favorite.showMovies(favoriteMovies);
    }
}