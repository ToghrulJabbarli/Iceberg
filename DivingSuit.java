package Icefield;

import java.util.Scanner;

public class DivingSuit extends Object{
	
	//all instances of this object will be the same name

	public DivingSuit() {
		this.Name = "Diving Suit";
	}
	
	
	public void Use() 
	{
	
	//THis will return the Figure to position (0,0), the origin point of the matrix
	//It's a default position for all retrived figures.
		System.out.println("Do you want to use it? Press any key to confirm");
		
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
			
		System.out.println("You have been rescued and moved to the default rescuing position");
		owner.Move(0, 0);
		
		// Logic
	}
	
}
