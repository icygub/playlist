package cs115;

public class Song {

    private String title;
    private Album album;
    private int lengthInSeconds;

    public Song(String title, Album album, int lengthInSeconds) {
        this.title = title;
        this.album = album;
        this.lengthInSeconds = lengthInSeconds;
    }

    public String getTitle() {
        return title;
    }

    public Album getAlbum() {
        return album;
    }

    public int getLengthInSeconds() {
        return lengthInSeconds;
    }
}
