package Icefield;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player{
	
	private String Name;
	private static int ID;
	private int Player_ID;
	
	public List<Figure> figures=new ArrayList<Figure>();
	
	public Player(String Name)
	{
		this.Name = Name;
		this.Player_ID = ID;
		//Generating ID
		ID++;
	}
	
	public int getID() // added by Murad & Toghrul
	{
		return Player_ID;
	}
	
	public String getName() { // added by Murad & Toghrul
		return Name;
	}
	
	
	

}
