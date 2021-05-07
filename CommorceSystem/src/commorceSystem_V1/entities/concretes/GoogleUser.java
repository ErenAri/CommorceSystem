package commorceSystem_V1.entities.concretes;

import commorceSystem_V1.entities.abstracts.Entity;

public class GoogleUser implements Entity{
	private String Email;
	private String Password;
	
	public GoogleUser(String email, String password) {
		super();
		Email = email;
		Password = password;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	
}
