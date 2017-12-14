package Models;

import java.util.ArrayList;

/**
 * Created by F.N on 08/12/2017.
 */

public class artistTrackList {
    private int artistId;
    private int tracklistId;
    private ArrayList< Track> artistlist;

    public artistTrackList(int artistId, int tracklistId, ArrayList<Track> artistlist) {
        this.artistId = artistId;
        this.tracklistId = tracklistId;
        this.artistlist = artistlist;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public int getTracklistId() {
        return tracklistId;
    }

    public void setTracklistId(int tracklistId) {
        this.tracklistId = tracklistId;
    }

    public ArrayList<Track> getArtistlist() {
        return artistlist;
    }

    public void setArtistlist(ArrayList<Track> artistlist) {
        this.artistlist = artistlist;
    }
}