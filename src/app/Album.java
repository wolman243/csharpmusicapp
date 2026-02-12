package app;

public class Album {
    int albumID;
    String albumName;
    String releaseDate;
    String type;
    int albumOwner;
    
    public Album(int albumID, String albumName, String releaseDate, String type, int albumOwner)
    {
        this.albumID = albumID;
        this.albumName = albumName;
        this.releaseDate = releaseDate;
        this.type = type;
        this.albumOwner = albumOwner;
    }
    
    public int getAlbumID() {
			return albumID;
		}
    public void setAlbumID(int albumID) 
    {
	this.albumID = albumID;
    }

    public String getAlbumName()
    {
	return albumName;
    }

    public void setAlbumName(String albumName)
    {
	this.albumName = albumName;
    }

    public String getReleaseDate() 
    {
	return releaseDate;
    }

    public void setReleaseDate(String releaseDate)
    {
	this.releaseDate = releaseDate;
    }

    public String getType() 
    {
	return type;
    }

    public void setType(String type) 
    {
	this.type = type;
    }

    public int getAlbumOwner() 
    {
        return albumOwner;
    }

    public void setAlbumOwner(int albumOwner)
    {
			this.albumOwner = albumOwner;
    }
    
}
