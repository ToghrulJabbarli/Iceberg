package Icefield;

import java.io.IOException;

public class Snow extends Object {
	
	
	// Coordinates of snow
	public int x;
	public int y;
	
	// Level of snow
	public int level;
	
	public Snow(int x, int y,int level)
	{
		this.x = x;
		this.y = y;
		this.level = level;
		this.Name = "Snow";
	}

	
	public void BuildingSnow() {
		String crd = "(" + x + "," + y + ")";
		System.out.println("Snow was set up on the " + crd);

	}
    
	
	public boolean isUsed() {
		// Logic: Check whether snow was set up or not
		if(this.level>0)
		{
			//for printing only
			this.BuildingSnow();
			return true;
		}
		return false;
	}

}
