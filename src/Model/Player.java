package Model;

import java.util.List;

public class Player {
	
	int id;
	int position;
	List<Infractions> pInfractions;
	List<Shot> pShots;
	
	public Player(int ID, int Position){
		id =ID;
		position = Position;
	}
	
	public void addInfraction(Infractions f){
		pInfractions.add(f);
	}
	
	public void addShot(Shot s){
		pShots.add(s);
	}
	
	public int getID(){
		return id;
	}
	public int getPosition(){
		return position;
	}
	public List<Infractions> getInfractions(){
		return pInfractions;
	}
	public List<Shot> getShots(){
		return pShots;
	}

}
