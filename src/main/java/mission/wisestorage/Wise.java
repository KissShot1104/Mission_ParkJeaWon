package mission.wisestorage;

public class Wise {
    private final Long id;
    private final String author;
    private final String saying;


    public Wise(Long id, String saying, String author) {
        this.id = id;
        this.saying = saying;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public String getSaying() {
        return saying;
    }

    public String getAuthor() {
        return author;
    }
}
