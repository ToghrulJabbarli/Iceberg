package Icefield;

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
	}

	@Override
	public void Used() {
		String crd = "(" + x + "," + y + ")";
		System.out.print("Snow was set up on the " + crd);
		
	}

	@Override
	public boolean isUsed() {
		// Logic: Check whether snow was set up or not
		if(this.level>0)
		{
			//for printing only
			this.Used();
			return true;
		}
		return false;
	}

}
