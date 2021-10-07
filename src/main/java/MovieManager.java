
public class MovieManager {
    public int showLength = 10;
    public Film[] films;
    public Film[] billboard;

    public MovieManager() {
        Film[] x = new Film[showLength];
        Film[] y = new Film[x.length];
        this.films = x;
        this.billboard = y;
    }

    public MovieManager(int showLength) {
        if (showLength <= 0) {
            showLength = 0;
        } else if (showLength >= 10) {
            showLength = 10;
        }
        Film[] x = new Film[showLength];
        Film[] y = new Film[x.length];
        this.showLength = showLength;
        this.films = x;
        this.billboard = y;
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
        for (int i = films.length - 1, x = 0; i >= 0; i--, x++) {
            billboard[i] = films[x];
        }
        return billboard;

    }

}
