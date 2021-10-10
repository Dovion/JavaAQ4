import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MovieManagerTest {
    public MovieManager managerTest = new MovieManager();
    public MovieManager managerTestLengthLow = new MovieManager(0);
    public MovieManager managerTestLengthMedium = new MovieManager(6);
    public MovieManager managerTestLengthHigh = new MovieManager(100);
    private int resultLengthLow = managerTestLengthLow.showLength;
    private int resultLengthMedium = managerTestLengthMedium.showLength;
    private int resultLengthHigh = managerTestLengthHigh.showLength;
    public Film[] films = {
            new Film("1", "Веном", "Экшн", "Http1"),
            new Film("2", "Гусь", "Экшн", "Http2"),
            new Film("3", "Лысый", "Экшн", "Http3"),
            new Film("4", "Человек-паук", "Экшн", "Http4"),
            new Film("5", "Трансформеры", "Экшн", "Http5"),
            new Film("6", "Такси", "Драма", "Http6"),
            new Film("7", "Форсаж", "Драма", "Http7"),
            new Film("8", "Форсаж 2", "Драма", "Http8"),
            new Film("9", "Форсаж 3", "Драма", "Http9"),
            new Film("10", "Форсаж 4", "Драма", "Http10")
    };

    @Test
    void addFilmTest() {
        managerTest.addFilm(films[0]);
        managerTest.addFilm(films[1]);
        managerTest.addFilm(films[2]);
        managerTest.addFilm(films[3]);
        managerTest.addFilm(films[4]);
        managerTest.addFilm(films[5]);
        managerTest.addFilm(films[6]);
        managerTest.addFilm(films[7]);
        managerTest.addFilm(films[8]);
        managerTest.addFilm(films[9]);
        boolean isEquals = true;
        for (int i = 0; i < films.length; i++) {
            Film x = films[i];
            Film y = managerTest.films[i];
            if (x.getName() == y.getName()
                    && x.getId() == y.getId()
                    && x.getGenre() == y.getGenre()
                    && x.getImageUrl() == y.getImageUrl()) {
                isEquals = true;
            } else {
                isEquals = false;
                break;
            }
        }
        assertTrue(isEquals);

    }

    @Test
    void showFilmTest() {
        managerTest.addFilm(films[0]);
        managerTest.addFilm(films[1]);
        managerTest.addFilm(films[2]);
        managerTest.addFilm(films[3]);
        managerTest.addFilm(films[4]);
        managerTest.addFilm(films[5]);
        managerTest.addFilm(films[6]);
        managerTest.addFilm(films[7]);
        managerTest.addFilm(films[8]);
        managerTest.addFilm(films[9]);
        managerTest.showFilm();
        boolean isEquals = true;
        for (int i = 0; i < films.length; i++) {
            Film x = films[i];
            Film y = managerTest.films[i];
            if (x.getName() != y.getName()) {
                isEquals = true;
            } else {
                isEquals = false;
                break;
            }
        }
        assertTrue(isEquals);
    }

    @Test
    void addFilmTestLengthLow() {
        managerTestLengthLow.addFilm(films[0]);
        managerTestLengthLow.addFilm(films[1]);
        managerTestLengthLow.addFilm(films[2]);
        managerTestLengthLow.addFilm(films[3]);
        managerTestLengthLow.addFilm(films[4]);
        managerTestLengthLow.addFilm(films[5]);
        managerTestLengthLow.addFilm(films[6]);
        managerTestLengthLow.addFilm(films[7]);
        managerTestLengthLow.addFilm(films[8]);
        managerTestLengthLow.addFilm(films[9]);
        boolean isEquals = true;
        for (int i = 0; i < resultLengthLow; i++) {
            Film x = films[i];
            Film y = managerTestLengthLow.films[i];
            if (x.getName() == y.getName()
                    && x.getId() == y.getId()
                    && x.getGenre() == y.getGenre()
                    && x.getImageUrl() == y.getImageUrl()) {
                isEquals = true;
            } else {
                isEquals = false;
                break;
            }
        }
        assertTrue(isEquals);

    }

    @Test
    void showFilmTestLengthLow() {
        managerTestLengthLow.addFilm(films[0]);
        managerTestLengthLow.addFilm(films[1]);
        managerTestLengthLow.addFilm(films[2]);
        managerTestLengthLow.addFilm(films[3]);
        managerTestLengthLow.addFilm(films[4]);
        managerTestLengthLow.addFilm(films[5]);
        managerTestLengthLow.addFilm(films[6]);
        managerTestLengthLow.addFilm(films[7]);
        managerTestLengthLow.addFilm(films[8]);
        managerTestLengthLow.addFilm(films[9]);
        managerTestLengthLow.showFilm();
        boolean isEquals = true;
        for (int i = 0; i < resultLengthLow; i++) {
            Film x = films[i];
            Film y = managerTestLengthLow.films[i];
            if (x.getId() != y.getId()) {
                isEquals = true;
            } else {
                isEquals = false;
                break;
            }
        }
        assertTrue(isEquals);
    }

    @Test
    void addFilmTestLengthMedium() {
        managerTestLengthMedium.addFilm(films[0]);
        managerTestLengthMedium.addFilm(films[1]);
        managerTestLengthMedium.addFilm(films[2]);
        managerTestLengthMedium.addFilm(films[3]);
        managerTestLengthMedium.addFilm(films[4]);
        managerTestLengthMedium.addFilm(films[5]);
        managerTestLengthMedium.addFilm(films[6]);
        managerTestLengthMedium.addFilm(films[7]);
        managerTestLengthMedium.addFilm(films[8]);
        managerTestLengthMedium.addFilm(films[9]);
        boolean isEquals = true;
        for (int i = 0; i < resultLengthMedium; i++) {
            Film x = films[i];
            Film y = managerTestLengthMedium.films[i];
            if (x.getName() == y.getName()
                    && x.getId() == y.getId()
                    && x.getGenre() == y.getGenre()
                    && x.getImageUrl() == y.getImageUrl()) {
                isEquals = true;
            } else {
                isEquals = false;
                break;
            }
        }
        assertTrue(isEquals);

    }

    @Test
    void showFilmTestLengthMedium() {
        managerTestLengthMedium.addFilm(films[0]);
        managerTestLengthMedium.addFilm(films[1]);
        managerTestLengthMedium.addFilm(films[2]);
        managerTestLengthMedium.addFilm(films[3]);
        managerTestLengthMedium.addFilm(films[4]);
        managerTestLengthMedium.addFilm(films[5]);
        managerTestLengthMedium.addFilm(films[6]);
        managerTestLengthMedium.addFilm(films[7]);
        managerTestLengthMedium.addFilm(films[8]);
        managerTestLengthMedium.addFilm(films[9]);
        managerTestLengthMedium.showFilm();
        boolean isEquals = true;
        for (int i = 0; i < resultLengthLow; i++) {
            Film x = films[i];
            Film y = managerTestLengthMedium.films[i];
            if (x.getId() != y.getId()) {
                isEquals = true;
            } else {
                isEquals = false;
                break;
            }
        }
        assertTrue(isEquals);
    }

    @Test
    void addFilmTestLengthHigh() {
        managerTestLengthHigh.addFilm(films[0]);
        managerTestLengthHigh.addFilm(films[1]);
        managerTestLengthHigh.addFilm(films[2]);
        managerTestLengthHigh.addFilm(films[3]);
        managerTestLengthHigh.addFilm(films[4]);
        managerTestLengthHigh.addFilm(films[5]);
        managerTestLengthHigh.addFilm(films[6]);
        managerTestLengthHigh.addFilm(films[7]);
        managerTestLengthHigh.addFilm(films[8]);
        managerTestLengthHigh.addFilm(films[9]);
        boolean isEquals = true;
        for (int i = 0; i < resultLengthHigh; i++) {
            Film x = films[i];
            Film y = managerTestLengthHigh.films[i];
            if (x.getName() == y.getName()
                    && x.getId() == y.getId()
                    && x.getGenre() == y.getGenre()
                    && x.getImageUrl() == y.getImageUrl()) {
                isEquals = true;
            } else {
                isEquals = false;
                break;
            }
        }
        assertTrue(isEquals);

    }

    @Test
    void showFilmTestLengthHigh() {
        managerTestLengthHigh.addFilm(films[0]);
        managerTestLengthHigh.addFilm(films[1]);
        managerTestLengthHigh.addFilm(films[2]);
        managerTestLengthHigh.addFilm(films[3]);
        managerTestLengthHigh.addFilm(films[4]);
        managerTestLengthHigh.addFilm(films[5]);
        managerTestLengthHigh.addFilm(films[6]);
        managerTestLengthHigh.addFilm(films[7]);
        managerTestLengthHigh.addFilm(films[8]);
        managerTestLengthHigh.addFilm(films[9]);
        managerTestLengthHigh.showFilm();
        boolean isEquals = true;
        for (int i = 0; i < resultLengthHigh; i++) {
            Film x = films[i];
            Film y = managerTestLengthHigh.films[i];
            if (x.getId() != y.getId()) {
                isEquals = true;
            } else {
                isEquals = false;
                break;
            }
        }
        assertTrue(isEquals);
    }
}