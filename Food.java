package Icefield;

import java.io.IOException;
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
	
	
		
		owner.EatFood();
		System.out.println("Food is used, you health has increas and is now"+ (owner.getHealth()));

		this.used = true;

		}

	}

