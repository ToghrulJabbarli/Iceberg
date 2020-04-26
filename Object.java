package Icefield;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
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
	
	public static boolean ReadFile(String filename, String order)
	{
		 try {
		      File myObj = new File(filename);
		      Scanner myReader = new Scanner(myObj);
		      
		      while (myReader.hasNextLine()) 
		      {
		    	  	String data = myReader.nextLine();
		    	  	if(data.equals(order))
		    	  		return true;
		      }
		      myReader.close();
		      
		    } catch (FileNotFoundException e) {
		    	
		    		System.out.println("An error occurred.");
		    		e.printStackTrace();
		 	}
 		return false;

	 }
		
	
	public static void Used(Object ob, Figure figure, String input, String output) {
		
	//First it will be shown on the GUI of the game
		showOnGUI(ob);	
	//This part is just for the skeleton. In the main program, this logic will be replaced with another one that can be implemented on GUI
	/*
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		*/
	    if(ReadFile (input, "pick"))
	    {
	    	System.out.println(ob.Name+" was taken!");
		//These two lines below makes the link between this instance and the owner's pocket (items list)
		//implementation shall be completed in figure class
	    	ob.owner = figure;
	    	ob.owner.CollectItem(ob);
	    	ob.used = true;
	    }
	}

	public static void WriteFile(String output, String outputOrder)throws IOException {
		
			BufferedWriter writer = new BufferedWriter(new FileWriter(output ,true));
			writer.newLine();
		    writer.write(outputOrder);
		     
		    writer.close();
	}
	

	public static boolean isUsed(Object ob) {
		// Logic: Check whether charge is used or not!
		return ob.used;
	}


}
