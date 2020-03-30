package Icefield;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StartProgram {
	/**
	 * Yifang Meng test part
	 * Testers press 'A' once ice field is loaded, at this moment it looks like many green grids
	 * Then tester input name and click "Enter" button, Setting window is shown in which tester can choose figures to control
	 * Once figure is chosen, click "Done" button then another player can join and repeat above steps
	 * If all players are set, tester can click "Start" button then MainMenu and Setting windows disappear and game starts
	 * @author Yifang Meng
	 */
	public static void YifangTest() {
		GUI gui=new GUI(GUI.HEIGHT, GUI.WIDTH);
		System.out.println("Welcome to Iceberg!");
		System.out.println("Press 'A' to add Player");
		gui.ShowGUI();
	}

	public static void main(String[] args) throws Throwable {
		
		// TODO Auto-generated method stub
		System.out.println("Please enter a number: ");
		System.out.println("1: Murad and Togrul");
		System.out.println("2: Ashraf");
		System.out.println("3: Achref");
		System.out.println("4: Yifang");
		while(true) {
			Scanner input=new Scanner(System.in);
			String result=input.next();
			int choice=Integer.valueOf(result);
			switch (choice) {
			case 1:
				
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				YifangTest();
				break;
					

			default:
				break;
			}
		}
	}

}
