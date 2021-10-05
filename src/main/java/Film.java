public class Film {
    private String id;
    private String name;
    private String genre;
    private String imageUrl;


    public Film(String id, String name, String genre, String imageUrl) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.imageUrl = imageUrl;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getImageUrl() {
        return imageUrl;
    }

}
