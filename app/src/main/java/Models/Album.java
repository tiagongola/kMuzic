package Models;

/**
 * Created by F.N on 08/12/2017.
 */

public class Album {
    private String name;
    private String description;
    private int artistId;
    private String relealedate;
    private String price;

    public Album(String name, String description, int artistId, String relealedate, String price) {
        this.name = name;
        this.description = description;
        this.artistId = artistId;
        this.relealedate = relealedate;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public String getRelealedate() {
        return relealedate;
    }

    public void setRelealedate(String relealedate) {
        this.relealedate = relealedate;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}
