package Icefield;

public class FlareGun extends Object {
	
	// Number of parts of the weapon
	public int NUM_OF_FLARES;
	public int NUM_OF_CHARGES;
	public int NUM_OF_GUN;
	
	// Booleans for enabaling the shooting from the flare gun
	public boolean gunIsCollected;
	public boolean chargeIsCollected;
	public boolean flaresAreCollected;
	

	@Override
	public boolean isUsed() {
		
		// Logic: Checks whether gun is used or not
		
		return false;
	}

	@Override
	public void Used() {
		// TODO Auto-generated method stub
		System.out.print("FlareGun was taken");
	}
	
	public boolean canShoot()
	{
		// Logic: Checks whether gun can shoot or not
		if(NUM_OF_FLARES >= 1 && NUM_OF_CHARGES >= 0 && NUM_OF_GUN == 1)
		{
			return true;
		}
		
		return false;
	}
	
	public void Charge()
	{
		// Logic: Charges the Flare Gun
	}
	
	public void Shoot()
	{
		// Logic: Shooting logic
		if(this.canShoot())
		{
			// Shooting Logic is fired here!
		}
	}
	

}
