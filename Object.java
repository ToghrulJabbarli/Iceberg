package Icefield;

public abstract class Object {
	
	public String Name;
	
	// Condition for visibility of the object
	public boolean isSeen;
	
	// Position of the object
	public int x;
	public int y;
	
	public abstract void Used(); // Object is consumed signal
	public abstract boolean isUsed();
	public void showOnGUI() {
		// TODO Auto-generated method stub
		
	}
	


}
