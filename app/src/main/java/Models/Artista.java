package Models;

/**
 * Created by F.N on 08/12/2017.
 */

public class Artista {
    private int id;
    private String Artist;
    private String description;
    private String musicStyle;
    private int artitscoverimage;
    private boolean verified;

    public Artista(int id, String Artist, String description, String musicStyle, int artitscoverimage, boolean verified) {
        this.id = id;
        this.Artist = Artist;
        this.description = description;
        this.musicStyle = musicStyle;
        this.artitscoverimage = artitscoverimage;
        this.verified = verified;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Artist;
    }

    public void setName(String name) {
        this.Artist = Artist;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMusicStyle() {
        return musicStyle;
    }

    public void setMusicStyle(String musicStyle) {
        this.musicStyle = musicStyle;
    }

    public int getArtitscoverimage() {
        return artitscoverimage;
    }

    public void setArtitscoverimage(int artitscoverimage) {
        this.artitscoverimage = artitscoverimage;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }



}
