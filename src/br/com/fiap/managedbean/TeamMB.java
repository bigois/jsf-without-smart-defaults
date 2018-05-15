package br.com.fiap.managedbean;

import javax.faces.bean.ManagedBean;

import br.com.fiap.bean.Team;
import br.com.fiap.dao.TeamDAO;

@ManagedBean
public class TeamMB {
	private TeamDAO listTeam = new TeamDAO();
	private String message;
	private Team team;
	private String searchFilter;

	public String registerView() {
		String view = "error";

		// INSERT CONTROLER TO SUCCESSO OR ERROR
		
		return view;
	}
	
	public String searchView() {
		String view = "error";

		// INSERT CONTROLER TO LIST, EMPTY OR ERROR
		
		return view;
	}

	public TeamDAO getListTeam() {
		return listTeam;
	}

	public String getMessage() {
		return message;
	}
	
	public String getSearchFilter() {
		return searchFilter;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}
	
}
