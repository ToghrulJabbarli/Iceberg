package Icefield;

import java.util.Scanner;

public class Shovel extends Object{

	public Shovel() {
		this.Name = "Shovel";
	}
	
	//Snow that would be removed
	public void Use(Snow sn) {
	
		System.out.println("Do you want to use it? Press any key to confirm");
		
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
	
		owner.removeSnow(sn);
	}


}

