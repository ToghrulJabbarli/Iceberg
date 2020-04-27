package Icefield;

import java.io.IOException;

public class FlareGun extends Object {
	
	// Number of parts of the weapon
	public int NUM_OF_FLARES;
	public int NUM_OF_CHARGES;
	public int NUM_OF_GUN;
	//++
	//public Player owner_player;
	
	// Booleans for enabaling the shooting from the flare gun
	public boolean gunIsCollected;
	public boolean chargeIsCollected;
	public boolean flaresAreCollected;
	


	public boolean canShoot()
	{
		// Logic: Checks whether gun can shoot or not
		if(NUM_OF_FLARES >= 1 && NUM_OF_CHARGES >= 1 && NUM_OF_GUN == 1)
		{
			return true;
		}
		
		return false;
	}
	
	public void Charge(Figure owner1,Charge charge, Flare flare,Gun gun)
	{
		// Logic: Charges the Flare Gun
		if (owner1.search_for_item(charge) && owner1.search_for_item(flare) && owner1.search_for_item(gun))
		{
			this.NUM_OF_CHARGES++;
			this.NUM_OF_FLARES++;
			this.NUM_OF_GUN++;
			System.out.println("Gun is ready to shoot, sir");
		}
	}
	
	public void Shoot(Player player)
	{
		int count=0;
		// Logic: Shooting logic
		if(this.canShoot())
		{
			// Shooting Logic is fired here!
			//if all the figures' position is the same
			//and since we are in the body of "if" so the gun is loaded and can shoot
			//game engine has to set winning
			for(int i=1; i<player.figures.size(); i++)
			{
				if((player.figures.get(i).x == player.figures.get(i-1).x) &&
				   (player.figures.get(i).y == player.figures.get(i-1).y))
					count++;
			}
			
			if(count == player.figures.size()) 
			{
				System.out.println("Gun is Fired, You won");
				GameEngine.setWinner(player);
			}
			
		}
		
	}
	

}
