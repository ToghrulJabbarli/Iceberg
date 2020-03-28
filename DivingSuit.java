package Icefield;

public class DivingSuit extends Object{
	
	public void showOnGUI()
	{
		// Logic: show this object in GUI
	}

	@Override
	public void Used() {
		System.out.println("DivingSuit was taken!");
		used = true;
	}
	@Override
	public boolean isUsed() {
		// Logic: Checks whether diving suit is used or not
		return used;
	}
	
public void Use() {
	
	//THis will return the Figure to position (0,0), the origin point of the matrix
	//It's a default position for all retrived figures.
		if(used)
			owner.Move(0, 0);
		System.out.println("You have been rescued and moved to the default rescuing position");
		// Logic
	}
	
}
