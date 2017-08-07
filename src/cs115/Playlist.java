package cs115;

import java.util.LinkedList;

public class Playlist {

    private LinkedList<Song> favoriteSongs;

    public Playlist() {
        favoriteSongs = new LinkedList<>();
    }

    public void addSong(Song song) { //song must exist in an album before being added to playlist
        boolean addedToPlaylist = false;
        for(Song s : song.getAlbum().getSongs()) {
            if(s == song) {
                favoriteSongs.add(song);
                addedToPlaylist = true;
                break;
            }
        }
        if(!addedToPlaylist)
            System.out.printf("%s is not in %s%n", song.getTitle(), song.getAlbum().getTitle());

    }
}
