package movieRecommender;

import java.util.List;

public class MovieRecommender implements Notification<Movie>{

    private UserPreference userPreference;
    private List<String> moviesShowable;


    public MovieRecommender(UserPreference userPreference, List<String> moviesShowable) {
        this.userPreference = userPreference;
        this.moviesShowable = moviesShowable;
    }


    public boolean getUserFavoriteActorMovies(List<Movie> movies){

        for (Movie movie:movies) {
            if (movie.getActors().contains(userPreference.getActorName())){
                System.out.println("Actor Movies"+ movie.getName());

                moviesShowable.add(movie.getName());
                return true;
            }

        }
        return false;
    }
    public boolean getUserFavoriteGenerMovies(List<Movie> movies){

        for (Movie movie:movies) {
            if (movie.getGenre().equals(userPreference.getGenre())){
                System.out.println("movieRecommender.Genre Movies"+ movie.getName());
                moviesShowable.add(movie.getName());
                return true;
            }

        }
        return false;
    }

    public boolean getUserFavoriteDirectorMovies(List<Movie> movies){

        for (Movie movie:movies) {
            if (movie.getDirector().equals(userPreference.getDirector())){
                System.out.println("Director Movies"+ movie.getName());
                moviesShowable.add(movie.getName());
                return true;
            }

        }
        return false;
    }
    public boolean getUserFavoriteEraMovies(List<Movie> movies){

        for (Movie movie:movies) {

            if (userPreference.compareDates(movie.getYear())) {
                System.out.println("Year Movies"+ movie.getName());
                moviesShowable.add(movie.getName());
                return true;
            }

        }
            return false;

    }


    @Override
    public boolean message(List<Movie> items) {
        String message = "";
        if (items.isEmpty()){
            return false;
        }
        return true;
    }
}

