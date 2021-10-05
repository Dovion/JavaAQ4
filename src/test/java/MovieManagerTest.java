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
        for (int i = 0; i < films.length; i++) {
            managerTest.addFilm(films[i]);
        }
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
        for (int i = 0; i < films.length; i++) {
            managerTest.addFilm(films[i]);
        }
        for (int i = 0; i < films.length; i++) {
            managerTest.showFilm(managerTest.films[i]);
        }
        boolean isEquals = true;
        for (int i = 0; i < films.length; i++) {
            Film x = films[i];
            Film y = managerTest.billboard[i];
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
        for (int i = 0; i < resultLengthLow; i++) {
            managerTestLengthLow.addFilm(films[i]);
        }
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
        for (int i = 0; i < resultLengthLow; i++) {
            managerTestLengthLow.addFilm(films[i]);
        }
        for (int i = 0; i < resultLengthLow; i++) {
            managerTestLengthLow.showFilm(managerTestLengthLow.films[i]);
        }
        boolean isEquals = true;
        for (int i = 0; i < resultLengthLow; i++) {
            Film x = films[i];
            Film y = managerTestLengthLow.billboard[i];
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
        for (int i = 0; i < resultLengthMedium; i++) {
            managerTestLengthMedium.addFilm(films[i]);
        }
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
        for (int i = 0; i < resultLengthMedium; i++) {
            managerTestLengthMedium.addFilm(films[i]);
        }
        for (int i = 0; i < resultLengthLow; i++) {
            managerTestLengthMedium.showFilm(managerTestLengthMedium.films[i]);
        }
        boolean isEquals = true;
        for (int i = 0; i < resultLengthLow; i++) {
            Film x = films[i];
            Film y = managerTestLengthMedium.billboard[i];
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
        for (int i = 0; i < resultLengthHigh; i++) {
            managerTestLengthHigh.addFilm(films[i]);
        }
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
        for (int i = 0; i < resultLengthHigh; i++) {
            managerTestLengthHigh.addFilm(films[i]);
        }
        for (int i = 0; i < resultLengthHigh; i++) {
            managerTestLengthHigh.showFilm(managerTestLengthHigh.films[i]);
        }
        boolean isEquals = true;
        for (int i = 0; i < resultLengthHigh; i++) {
            Film x = films[i];
            Film y = managerTestLengthHigh.billboard[i];
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