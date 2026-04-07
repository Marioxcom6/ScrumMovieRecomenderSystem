package src.movie;

public class UserPreference {

    private String actorName;
    private Genre genre;
    private String director;
    private int eraIntial;
    private int eraFinal;

    public UserPreference(String actorName, Genre genre, String director, int eraIntial, int eraFinal) {
        this.actorName = actorName;
        this.genre = genre;
        this.director = director;
        this.eraIntial = eraIntial;
        this.eraFinal = eraFinal;
        }
    public boolean compareDates(int movieYear) {
        return movieYear >= this.eraIntial && movieYear <= this.eraFinal;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getEraIntial() {
        return eraIntial;
    }

    public void setEraIntial(int eraIntial) {
        this.eraIntial = eraIntial;
    }

    public int getEraFinal() {
        return eraFinal;
    }

    public void setEraFinal(int eraFinal) {
        this.eraFinal = eraFinal;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
