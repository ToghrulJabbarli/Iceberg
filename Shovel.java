package Icefield;

public class Shovel extends Object{

	@Override
	public void Used() {
	System.out.println("Shovel was used!");
		used = true;
	}

	@Override
	public boolean isUsed() {
	// Logic: Checks whether shovel is used or not
		return used;
	}

	public void Use() {
	
		if(this.used)
			owner.removeSnow();
		//there should be a printing in the function body in figure to state what happened
	}


}
