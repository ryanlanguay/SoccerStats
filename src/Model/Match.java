package Model;

public class Match {
	Team home;
	Team away;
	Team winner;
	int id;
	
	int homeGoals;
	int awayGoals;
	
	public Match(Team homeTeam, Team awayTeam, int ID){
		id=ID;
		home = homeTeam;
		away = awayTeam;
	}

	public void addHomeGoal(){
		homeGoals++;
	}
	public void addAwayGoal(){
		awayGoals++;
	}
		
	public Team getWinner(){
		if(homeGoals>awayGoals){
			return home;
		}else if(awayGoals > homeGoals){
			return away;
		}else{
			return null; //tie game
		}
	}
}
