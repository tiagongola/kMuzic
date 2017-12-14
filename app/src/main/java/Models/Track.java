package Models;

/**
 * Created by F.N on 08/12/2017.
 */

public class Track {
    private int id;
    private String aPath;
    private String aName;
    private Album album;
    private String Artist;
    private int trackCover;





    public Track() {
        this.id = id;
        this.aPath = aPath;
        this.aName = aName;
        this.album = Album;
        this.Artist = artist;
        this.trackCover = trackCover;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getaPath() {
        return aPath;
    }

    public void setaPath(String aPath) {
        this.aPath = aPath;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public String getArtist() {
        return Artist;
    }

    public void setArtist(String artist) {
        Artist = artist;
    }

    public int getTrackCover() {
        return trackCover;
    }

    public void setTrackCover(int trackCover) {
        this.trackCover = trackCover;
    }

    public void setArtist(Artista fs) {
    }

}
