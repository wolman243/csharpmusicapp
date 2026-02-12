
package app;

public class User {
    String email;
    String profileName;
    String password;
    
    public User(String email, String profileName, String password)
    {
        this.email = email;
        this.profileName = profileName;
        this.password = password;
    }
    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProfileName() {
		return profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
