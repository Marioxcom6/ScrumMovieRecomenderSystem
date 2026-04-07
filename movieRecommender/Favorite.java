package movieRecommender;

import java.util.ArrayList;
import java.util.List;

public class Favorite {


    private List<Movie> favoritesMovies;

    public Favorite(List<Movie> favoritesMovies) {
        this.favoritesMovies = favoritesMovies;
    }

    public void addMovie(Movie movie){
        favoritesMovies.add(movie);
    }
    public void showMovies(List<Movie> movies){

        System.out.println("Here are your favorites movies: ");
        for (Movie movie: movies){
            System.out.println(movie);
        }
    }

    public List<Movie> getFavoritesMovies() {
        return favoritesMovies;
    }

    public void setFavoritesMovies(List<Movie> favoritesMovies) {
        this.favoritesMovies = favoritesMovies;
    }
}
