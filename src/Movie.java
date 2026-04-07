import java.util.ArrayList;

public class Movie {
    private int id;
    private String title;
    private String director;
    private String description;
    private String genero;
    private int year;
    private ArrayList<String> actors;

    public Movie(int id, String title, String director, String description, String genero, int year, ArrayList<String> actors) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.description = description;
        this.genero = genero;
        this.year = year;
        this.actors = actors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public ArrayList<String> getActors() {
        return actors;
    }
    public void setActors(ArrayList<String> actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", description='" + description + '\'' +
                ", genero='" + genero + '\'' +
                ", year=" + year +
                ", actors=" + actors +
                '}';
    }
}
