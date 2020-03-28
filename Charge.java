package Icefield;

public class Charge extends Object {

	public void showOnGUI()
	{
		// Logic: show this object in GUI
	}
	
	@Override
	public void Used() {
		System.out.print("Charge is used!");
		used = true;
	}

	@Override
	public boolean isUsed() {
		// Logic: Check whether charge is used or not!
		return used;
	}

}
