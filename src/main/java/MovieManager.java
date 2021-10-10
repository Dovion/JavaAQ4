
public class MovieManager {
    public int showLength = 10;
    public Film[] films;

    public MovieManager() {
        Film[] x = new Film[showLength];
        this.films = x;
    }

    public MovieManager(int showLength) {
        if (showLength <= 0) {
            showLength = 0;
        } else if (showLength >= 10) {
            showLength = 10;
        }
        Film[] x = new Film[showLength];
        this.showLength = showLength;
        this.films = x;
    }

    public void addFilm(Film film) {
        for (int i = 0; i < films.length; i++) {
            if (films[i] == null) {
                films[i] = film;
                return;
            }
        }

    }

    public Film[] showFilm() {
        Film[] temp = new Film[films.length];
        for (int i = films.length - 1, x = 0; i >= 0; i--, x++) {
            temp[i] = films[x];
        }
        for (int i = 0; i < films.length; i++) {
            films[i] = temp[i];
        }
        return films;

    }

}
