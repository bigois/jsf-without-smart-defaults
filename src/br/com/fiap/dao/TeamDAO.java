package br.com.fiap.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.bean.Team;

public class TeamDAO {
	static List<Team> teamList;
	
	public TeamDAO() {
		TeamDAO.teamList = new ArrayList<Team>();
	}
	
	public ArrayList<Team> findAll() {
		return (ArrayList<Team>) TeamDAO.teamList;
	}
	
	public ArrayList<Team> findByName(String name) {
		return (ArrayList<Team>) TeamDAO.teamList;
	}
	
	public ArrayList<Team> findByState(String state) {
		return (ArrayList<Team>) TeamDAO.teamList;
	}
	
	public ArrayList<Team> findByFoundationYear(Integer FoundationYear) {
		return (ArrayList<Team>) TeamDAO.teamList;
	}
	
}
