package Model;

import java.util.ArrayList;
import java.util.List;

public class Manager {
	List<Match> leagueMatches;
	List<Team> leagueTeams;
	
	public Manager(){
		leagueMatches = new ArrayList<Match>();
		leagueTeams = new ArrayList<Team>();
	} 
	
	public void DisplayTopScoringMatches(){
		int i = 1;
		Match highestScore = leagueMatches.get(0);
		int totalGoals = highestScore.homeGoals+highestScore.awayGoals;
		while (i < leagueMatches.size()) {
			if (leagueMatches.get(i).homeGoals+leagueMatches.get(i).awayGoals>totalGoals) {
				highestScore = leagueMatches.get(i);
				totalGoals = highestScore.homeGoals+highestScore.awayGoals;
			}
		}
		System.out.println("The highest scoring match is the match with ID "+highestScore.id);
	}
	public void DisplayTop5Players(){	
	}
	
	public void DisplayTopGoalie(){
		//TODO: IMPLEMENT THIS
	}
	
	public static void main(String args[]){
		Manager m = new Manager();
		m.leagueMatches.add(new Match(new Team("Team 1"), new Team("Team 2"), 1));
		m.leagueMatches.get(0).addHomeGoal();
		m.DisplayTopScoringMatches();
	}
}
