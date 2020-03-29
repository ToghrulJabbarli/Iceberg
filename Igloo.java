package Icefield;

import java.util.Scanner;

public class Igloo extends Object{

	//all instances of this object will be the same name

	public Igloo() {
		this.Name = "Igloo";
	}
	//this function should be used in a way that it's called during the whole Blizzard period to keep health the same.
public void Use() {
		
		// Logic
	
	System.out.println("Do you want to use it? Press any key to confirm");
	
	Scanner sc = new Scanner(System.in);
	char ch = sc.next().charAt(0);
			//keeps health the same during all the blizzard
			//During all the blizzard, the figure can call this function to save his health
			System.out.println("Igloo has been built. Owner of this Igloo shall not feel any pain during this blizzard.");
			owner.setHealth(owner.getHealth());
			System.out.println("your health now is:" + owner.getHealth());
			//We should call SkillUse() here but it needs further implementation especially in GUI.
		
	}


}
