package com.springdemos.springcore.stereotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("maincoach")
public class Coach {
	@Value("23")
	private int id;
	@Value("John")
	private String name;
	@Value("${dbUser}") // $ comes from the properties
	private String dbUser;
	@Value("#{topics}") // #comes from the config file (like id)
	private List<String> topics;
	@Autowired
	private CoachProfile profile;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDbUser() {
		return dbUser;
	}

	public void setDbUser(String dbUser) {
		this.dbUser = dbUser;
	}

	public List<String> getTopics() {
		return topics;
	}

	public void setTopics(List<String> topics) {
		this.topics = topics;
	}

	public CoachProfile getProfile() {
		return profile;
	}

	public void setProfile(CoachProfile profile) {
		this.profile = profile;
	}

	@Override
	public String toString() {
		return "Coach [id=" + id + ", name=" + name + ", dbUser=" + dbUser + ", topics=" + topics + ", profile="
				+ profile + "]";
	}

}
