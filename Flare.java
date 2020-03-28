package Icefield;

public class Flare extends Object {
	
	@Override
	public void Used() {
		used = true;
		System.out.println("Flare was taken!");
	}
	@Override
	public boolean isUsed() {
		// Logic: Checks whether flare is used or not
		
		return used;
	}
	
	
	

}
