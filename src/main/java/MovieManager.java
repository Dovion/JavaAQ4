
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

//    public int getShowLength() {
//        if (showLength <= 0) {
//            this.showLength = 0;
//        } else if (showLength >= 10) {
//            this.showLength = 10;
//        }
//        return this.showLength;
//    }

    public void addFilm(Film film) {
        for (int i = 0; i < films.length; i++) {
            if (films[i] == null) {
                films[i] = film;
                return;
            }
        }
    }

    public void showFilm(Film film) {
        for (int i = films.length - 1; i >= 0; i--) {
            if (billboard[i] == null) {
                billboard[i] = film;
                return;
            }

        }

    }
}
