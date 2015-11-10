package Model;

import java.util.List;

public class Player {
	
	String name;
	int position;
	List<Infractions> pInfractions;
	List<Shot> pShots;
	
	public Player(String Name, int Position){
		name =Name;
		if (Position>=1 && Position<=11) position = Position;
		if (position==0) System.out.println("Position entered is invalid and is not set; choose a # between 1 and 11");
	}
	
	public void addInfraction(Infractions f){
		pInfractions.add(f);
	}
	
	public void addShot(Shot s){
		pShots.add(s);
	}
	
	public String getName(){
		return name;
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
