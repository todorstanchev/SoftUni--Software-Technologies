package imdb.bindingModel;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class FilmBindingModel {

    private String name;
    private String genre;
    private String director;
    private int year;

    @NotNull
    @Size(min = 1)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NotNull
    @Size(min = 1)
    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @NotNull
    @Size(min = 1)
    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}