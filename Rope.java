package Icefield;

import java.util.Scanner;

public class Rope extends Object{

	//all instances of this object will be the same name

	public Rope() {
		this.Name = "Rope";
	}
	
	public void Use(Figure rescued_figure) {
		
		System.out.println("Do you want to use it? Press any key to confirm");
		
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		System.out.println(rescued_figure.getName() + "has been rescued successfully !");
		rescued_figure.Move(0,0);
		
	}
	

	

}
