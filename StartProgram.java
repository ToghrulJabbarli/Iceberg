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
	/**
	   *Ashraf Weheash Testing part
	   *This is to test all the objects of the game like Charge, Flare, etc.
	   *There are two different scenarios during the whole game
	   	-1- A figure uses the object for himself like Charge, food, DivingSuit, Igloo. So I used the main
			-So I used the main Figure -> figure1
		-2- A figure uses the object on onther figure. So, I used figure1 as main figure and figure2 as second role
			-like in a rope, figure1 will use it on figure2 to save it and figure2 will be given as a parameter in the Use()
			function of figure1. Setting this parameter will be defined on GUI. 
	public static void AshrafTest()
	{
		Figure figure1 = new Figure("Ashraf", 5, 2,4);
		Figure figure2 = new Figure("Murad", 4,2 ,5);
		
		
		Charge charge1 = new Charge();
		charge1.Used(charge1, figure1);
		
		Flare f1 = new Flare();
		f1.Used(f1, figure1);
		
		DivingSuit DS1 = new DivingSuit();
		DS1.Used(DS1, figure1);
		DS1.Use();
		
		Food food1 = new Food();
		food1.Used(food1, figure1);
		food1.Use();
		
		
		Igloo igloo1 = new Igloo();
		Igloo.Used(igloo1, figure1);
		igloo1.Use();
		
		Rope rope1 = new Rope();
		rope1.Used(rope1, figure1);
		rope1.Use(figure2);
		
		Shovel shovel1 = new Shovel();
		shovel1.Used(shovel1, figure1);
		shovel1.Use();
		
		Snow snow1 = new Snow(3,4 ,3);
		snow1.BuildingSnow();
		
	}

	public static void MuradandToghrulTest() {
		System.out.println(" --------------------MURAD & TOGHRUL------------------- \n");
		
		
		List<Player> players = new ArrayList<Player>();
		Player player_1 = new Player("Murad");
		Player player_2 = new Player("Toghrul");
		players.add(player_1);
		players.add(player_2);
		
		GUI gui=new GUI(GUI.HEIGHT, GUI.WIDTH);
		
		Map map = new Map(25,25,players);
		map.showOnGUI(gui, map);
		for(int i = 0; i < players.size(); i++)
		{
			System.out.println("Player " + i + ": ID: " + players.get(i).getID() + ", Name: " + players.get(i).getName());
		}
		
		
		
		// Iceberg
		Iceberg i_1 = new Iceberg(5,5,10,map);
		System.out.println("Iceberg is fittable: " + i_1.isFittable());
		System.out.println("Iceberg name: " + i_1.getName());
		i_1.Fit(map);
		
		System.out.print("\n\n");
		
		Iceberg i_2 = new Iceberg(5,5,10,map);
		System.out.println("Iceberg is fittable: " + i_2.isFittable());
		System.out.println("Iceberg name: " + i_2.getName());
		i_2.Fit(map);
		
		Iceberg[] icebergs = new Iceberg[2];
		icebergs[0] = i_1;
		icebergs[1] = i_2;
		
		
		map.SetIcebergs(icebergs);
		map.GenerateIcebergsOnMap();
		
		// Blizzard
		Blizzard blizzard = new Blizzard(i_1);
		blizzard.StartBlizzard();
		blizzard.StopBlizzard();
		
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
				MuradandToghrulTest();
				break;
			case 2:
				AshrafTest();
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
