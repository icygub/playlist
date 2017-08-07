package cs115;

public class Song {

    private String title;
    private int lengthInSeconds;

    public Song(String title, int lengthInSeconds) {
        this.title = title;
        this.lengthInSeconds = lengthInSeconds;
    }

    public String getTitle() {
        return title;
    }

    public int getLengthInSeconds() {
        return lengthInSeconds;
    }
}
