package movieRecommender;

import java.util.List;

public class MovieRecommender implements Notification<Movie>{

    private UserPreference userPreference;
    private List<Movie> moviesShowable;
    private static int MINIMUM_MATCH = 2;

    public MovieRecommender(UserPreference userPreference, List<Movie> moviesShowable) {
        this.userPreference = userPreference;
        this.moviesShowable = moviesShowable;
    }
    // He creado showMovies y addMovies para separar la logica ahora cada funcion hace solo una cosa
    private boolean recommendedMovies(List<Movie> movies){
        for (Movie movie:movies){
            int score = scorebyActor(movie)+scorebyGenre(movie)+scorebyDirector(movie)+scorebyEra(movie);
            if (score >= MINIMUM_MATCH){
                addMovies(movie);
            }
        }
        return !isMovieEmpty(moviesShowable);
    }
    private boolean isMovieEmpty(List<Movie> movies){
        if (movies.isEmpty()){
            System.out.println("We couldn't find any movie for you! Sorry");
            return true;
        }
        return false;
    }
    private void addMovies(Movie movie){
        moviesShowable.add(movie);
    }

    private void showMovies(List<Movie> movies){

        for (int i = 0; i < movies.size(); i++) {
            System.out.println(i+1 +" This movie matches your preference: "+  movies.get(i).getName());
        }
    }
    private int scorebyActor(Movie movie){
        return movie.getActors().contains(userPreference.getActorName()) ? 1:0;
    }
    private int scorebyGenre(Movie movie){
        return movie.getGenre().equals(userPreference.getGenre()) ? 1:0;
    }

    private int scorebyDirector(Movie movie){
        return movie.getDirector().equals(userPreference.getDirector()) ? 1:0;
    }

    private int scorebyEra(Movie movie){
        return userPreference.compareDates(movie.getYear()) ? 1:0;
    }


    @Override
    public boolean message(List<Movie> movies) {
        if (isMovieEmpty(movies)){
            return false;
        }
        boolean found = recommendedMovies(movies);

        if (found){
            showMovies(moviesShowable);
            return true;
        }
        return false;
    }
}

