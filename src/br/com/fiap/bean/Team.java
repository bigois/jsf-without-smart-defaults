package br.com.fiap.bean;

public class Team {
	private String state;
	private String name;
	private Integer foundedIn;
	
	public Team() {}

	public Team(String state, String name, Integer foundedIn) {
		this.state = state;
		this.name = name;
		this.foundedIn = foundedIn;
	}

	public String getstate() {
		return state;
	}

	public void setstate(String state) {
		this.state = state;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public Integer getfoundedIn() {
		return foundedIn;
	}

	public void setfoundedIn(Integer foundedIn) {
		this.foundedIn = foundedIn;
	}

}
