package cs115;

import java.util.ArrayList;

public class Album {

    private String title;
    private ArrayList<Song> songs;

    public Album(String title) {
        this.title = title;
        songs = new ArrayList();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void printAlbum() {
        System.out.println("Album: " + title);
        for(Song song : songs) {
            System.out.println(song.getTitle());
        }
    }
}
