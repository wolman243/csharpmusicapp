
package app;


public class Playlist {
    int playlistID;
    String playlistName;
    String createdBy;
    
    public Playlist(int playlistID, String playlistName, String createdBy)
    {
        this.playlistID = playlistID;
        this.playlistName = playlistName;
        this.createdBy = createdBy;
    }
    
    public int getPlaylistID() {
		return playlistID;
	}

	public void setPlaylistID(int playlistID) {
		this.playlistID = playlistID;
	}

	public String getPlaylistName() {
		return playlistName;
	}

	public void setPlaylistName(String playlistName) {
		this.playlistName = playlistName;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
        
}
