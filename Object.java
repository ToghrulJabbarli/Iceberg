package Icefield;

public abstract class Object {
	
	public String Name;
	//++Each object get an owner after being retrived by this owner
	public Figure owner;
	// Condition for visibility of the object
	public boolean isSeen;
	//++
	public boolean used = false;
	
	// Position of the object
	public int x;
	public int y;
	
	public abstract void Used(); // Object is consumed signal
	public abstract boolean isUsed();
		


}
