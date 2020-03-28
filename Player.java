package Icefield;

import java.util.List;
import java.util.Random;

public class Player{
	
	private String Name;
	private int ID;
	
	public List<Figure> figures;
	
	public Player(String Name)
	{
		this.Name = Name;
		//Generating ID of the player between 1000000 and 9999999
		while(this.idExists(ID) != false)
		{
			ID = this.getRandomIDInRange(1000000, 9999999);	
		}
		
		
	}
	
	public static boolean idExists(int ID)
	{
		// Logic: Check whether player with this ID exists
		return true;
	}
	
	// Player ID Generation
	private static int getRandomIDInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

}
