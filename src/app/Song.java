
package app;

public class Song {
    int songID;
    String title;
    int S_albumID;
    int ownerID;
    
    public Song(int songID, String title, int S_albumID, int ownerID)
    {
        this.songID = songID;
        this.title = title;
        this.S_albumID = S_albumID;
        this.ownerID = ownerID;
    }
    public int getSongID() {
		return songID;
	}

	public void setSongID(int songID) {
		this.songID = songID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getS_albumID() {
		return S_albumID;
	}

	public void setS_albumID(int s_albumID) {
		S_albumID = s_albumID;
	}

	public int getOwnerID() {
		return ownerID;
	}

	public void setOwnerID(int ownerID) {
		this.ownerID = ownerID;
	}
}
