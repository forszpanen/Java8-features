public class Film {
    private String title;
    private String author;
    public Film(String title, String author) {
        this.title = title;
        this.author = author;
    }
    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}