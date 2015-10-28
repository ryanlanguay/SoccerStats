package Model;

import java.util.Iterator;
import java.util.List;

public class Manager {
	List<Match> leagueMatches;
	List<Team> leageTeams;
	
	public Manager(){
		//TODO: IMPLEMENT THIS TOO
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
		m.DisplayTop5Players();
		m.DisplayTopScoringMatches();
		m.DisplayTopGoalie();
	}
}
