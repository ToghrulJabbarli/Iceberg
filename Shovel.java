package Icefield;

import java.util.Scanner;

public class Shovel extends Object{

	public Shovel() {
		this.Name = "Shovel";
	}
	
	public void Use() {
	
		System.out.println("Do you want to use it? Press any key to confirm");
		
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		owner.removeSnow();
		//there should be a printing in the function body in figure to state what happened
	}


}
