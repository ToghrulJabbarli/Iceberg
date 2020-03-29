package Icefield;

import java.util.Scanner;

public class Shovel extends Object{

	public Shovel() {
		this.Name = "Shovel";
	}
	
	//Achref: i ADDED  2 parameters since i changed the remove snow function
	public void Use(Snow sn,int redlvl) {
	
		System.out.println("Do you want to use it? Press any key to confirm");
		
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		owner.removeSnow(sn,redlvl);
		//there should be a printing in the function body in figure to state what happened
	}


}

