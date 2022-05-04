package com.sapient.endur.credential;

public class Credential {
	
	private String username;
	private String password;
	private static Credential credential = null;
	
	private Credential() {
		
	}
	
	private Credential(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public static Credential createInstance(String username, String password) {
		if(credential == null) {
			credential = new Credential(username, password);
		}
		
		return credential;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}