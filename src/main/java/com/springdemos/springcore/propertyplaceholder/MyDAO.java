package com.springdemos.springcore.propertyplaceholder;

public class MyDAO {
	private String dbUrl;
	private String dbUser;
	private String password;

	public MyDAO(String dbUrl, String dbUser, String password) {
		super();
		this.dbUrl = dbUrl;
		this.dbUser = dbUser;
		this.password = password;
	}

	public String getDbUrl() {
		return dbUrl;
	}

	public void setDbUrl(String dbUrl) {
		this.dbUrl = dbUrl;
	}

	public String getDbUser() {
		return dbUser;
	}

	public void setDbUser(String dbUser) {
		this.dbUser = dbUser;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "MyDAO [dbUrl=" + dbUrl + ", dbUser=" + dbUser + ", password=" + password + "]";
	}

}
