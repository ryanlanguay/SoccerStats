package Model;

import java.util.ArrayList;
import java.util.List;

public class Manager {
	private List<Match> leagueMatches;
	List<Team> leagueTeams;
	private static Manager theInstance = null;
	private Manager(){
		setLeagueMatches(new ArrayList<Match>());
		leagueTeams = new ArrayList<Team>();
	} 
	public static Manager getInstance()
	  {
	    if(theInstance == null)
	    {
	      theInstance = new Manager();
	    }
	    return theInstance;
	  }
	
	public void DisplayTopScoringMatches(){
		int i = 1;
		Match highestScore = getLeagueMatches().get(0);
		int totalGoals = highestScore.homeGoals+highestScore.awayGoals;
		while (i < getLeagueMatches().size()) {
			if (getLeagueMatches().get(i).homeGoals+getLeagueMatches().get(i).awayGoals>totalGoals) {
				highestScore = getLeagueMatches().get(i);
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
		m.getLeagueMatches().add(new Match(new Team("Team 1"), new Team("Team 2"), 1));
		m.getLeagueMatches().get(0).addHomeGoal();
		m.DisplayTopScoringMatches();
	}
	public List<Match> getLeagueMatches() {
		return leagueMatches;
	}
	public void setLeagueMatches(List<Match> leagueMatches) {
		this.leagueMatches = leagueMatches;
	}
}
