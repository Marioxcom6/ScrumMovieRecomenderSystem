public class User extends Person {
    private int iD;
    private String email;
    private String actorFav;
    private String movieFav;
    private String directorFav;

    public User(String nombre, String password, int iD, String email, String actorFav, String movieFav, String directorFav) {
        super(nombre, password);
        this.iD = iD;
        this.email = email;
        this.actorFav = actorFav;
        this.movieFav = movieFav;
        this.directorFav = directorFav;


    }

    @Override
    public String toString() {
        return "User{" +
                "iD='" + iD + '\'' +
                ", email='" + email + '\'' +
                ", actorFav='" + actorFav + '\'' +
                ", movieFav='" + movieFav + '\'' +
                ", directorFav='" + directorFav + '\'' +
                '}';
    }
}
