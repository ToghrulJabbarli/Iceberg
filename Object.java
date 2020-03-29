package Icefield;

import java.util.Scanner;

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
	
	public static void showOnGUI(Object ob)
	{
		System.out.println("This is a "+ ob.Name +", press any key to pick");
		// Logic: show this object in GUI
	}
	
	public static void Used(Object ob, Figure figure) {
		
	//First it will be shown on the GUI of the game
		showOnGUI(ob);	
	//This part is just for the skeleton. In the main program, this logic will be replaced with another one that can be implemented on GUI
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		System.out.println(ob.Name+" was taken!");
		//These two lines below makes the link between this instance and the owner's pocket (items list)
		//implementation shall be completed in figure class
		ob.owner = figure;
	  //ob.owner.CollectItem();
		ob.used = true;
	}


	public static boolean isUsed(Object ob) {
		// Logic: Check whether charge is used or not!
		return ob.used;
	}


}
