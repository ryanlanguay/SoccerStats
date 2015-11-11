package Model;

import java.util.ArrayList;
import java.util.List;

public class Team {
	
	String name;
	List<Player> tPlayers;
	
	public Team(String teamName){
		name = teamName;
		tPlayers = new ArrayList<Player>();
	}
	
	public void addPlayer(Player p){
		tPlayers.add(p);
	}
	
	public List<Player> getPlayers(){
		return tPlayers;
	}
	
	//TODO: IMPLEMENT THIS
	public List<Player> getTop5Players(){
		return null;
	}

}
