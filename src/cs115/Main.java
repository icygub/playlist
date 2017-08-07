package cs115;


//Album stored in arraylist
//once songs added to playlist, create a menu option
//quit, skip forward to next, skip backwards ot previous, replay current song
//list songs in the playlist
//song must exist in album before added to playlist
//remove current song from the playlist
public class Main {

    public static void main(String[] args) {
	    Album pianoAlbum = new Album("Piano Songs");
	    pianoAlbum.addSong(new Song("Turkish March", 400));
	    pianoAlbum.addSong(new Song("Moonlight", 800));
	    pianoAlbum.addSong(new Song("Clair de Lune", 500));
	    pianoAlbum.addSong(new Song("Darth Vader Theme", 120));

	    pianoAlbum.printAlbum();
    }
}
