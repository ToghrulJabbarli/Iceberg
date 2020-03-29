package Icefield;

import java.util.Scanner;

public class Food extends Object {

	public Food() {
		this.Name = "Food";
	}
	
public void Use() {
		
		// Logic

	System.out.println("Do you want to use it? Press any key to confirm");
	
	Scanner sc = new Scanner(System.in);
	char ch = sc.next().charAt(0);
	
	System.out.println("Food is used and your health is now"+ owner.getHealth());
	//This function is not working properly, Achref's part
	owner.EatFood();

	}
}
