package Icefield;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StartProgram {
	/**
	 * Yifang Meng test part Testers press 'A' once ice field is loaded, at this
	 * moment it looks like many green grids Then tester input name and click
	 * "Enter" button, Setting window is shown in which tester can choose figures to
	 * control Once figure is chosen, click "Done" button then another player can
	 * join and repeat above steps If all players are set, tester can click "Start"
	 * button then MainMenu and Setting windows disappear and game starts
	 * 
	 * @author Yifang Meng
	 */
	public static void YifangTest() {
		GUI gui = new GUI(GUI.HEIGHT, GUI.WIDTH);
		System.out.println("Welcome to Iceberg!");
		System.out.println("Press 'A' to add Player");
		gui.ShowGUI();
	}

	
	public static void MuradToghrulBlizzardTest() {
		
	}
	
	
	public static void main(String[] args) throws Throwable {

		// TODO Auto-generated method stub
		System.out.println("Please enter your choice:  ");
		while (true) {
			Scanner input = new Scanner(System.in);
			String result = input.nextLine();
			String[] option = result.split(" ");
			if (option[0].equals("create")) {
				if (option[1].equals("GUI")) {
					YifangTest();
				}
				if (option[1].equals("blizzard")) {
					
					// CREATE PLAYERS
					System.out.print("Murad & Toghrul Blizzard\n");
					Player p0 = new Player("player_0");
					Player p1 = new Player("player_1");
					List<Player> players = new ArrayList<Player>();
					players.add(p0);
					players.add(p1);
					List<Iceberg> icebergs = new ArrayList<Iceberg>();
				
					// CREATE COORDINATES OF 0 ICEBERG
					List<Point> i_0_cords = new ArrayList<Point>();
					i_0_cords.add(new Point(0,0));
					i_0_cords.add(new Point(0,1));
					i_0_cords.add(new Point(0,2));
					i_0_cords.add(new Point(0,3));
					Iceberg i_0 = new Iceberg(2,2,i_0_cords,5);
					
					// CREATE COORDINATES OF 1 ICEBERG
					List<Point> i_1_cords = new ArrayList<Point>();
					i_1_cords.add(new Point(3,4));
					i_1_cords.add(new Point(4,4));
					i_1_cords.add(new Point(5,4));
					i_1_cords.add(new Point(6,4));
					Iceberg i_1 = new Iceberg(2,2,i_1_cords,7);
					
					// ADD ICEBERGS TO THE ICEBERG LIST
					icebergs.add(i_0);
					icebergs.add(i_1);
					
					// INITIALIZE MAP
					Map map = new Map(10,10,players,icebergs);
					
					// GENERATE ICEBERGS ON MAP
					map.GenerateIcebergsOnMap();
					
					// TRIGGER BLIZZARD ON MAP
					map.TriggerBlizzard();

					
				    map.printMapSnowLevel();
					
				}
				if (option[1].equals("igloo")) {

				}
				if (option[1].equals("iceberg")) {
					List<Point> i_0_cords = new ArrayList<Point>();
					i_0_cords.add(new Point(0,0));
					i_0_cords.add(new Point(0,1));
					i_0_cords.add(new Point(0,2));
					i_0_cords.add(new Point(0,3));
					Iceberg i_0 = new Iceberg(2,2,i_0_cords,5);
					i_0.print();
				}
				if (option[1].equals("snow")) {

				}
				if (option[1].equals("flare")) {

				}
				if (option[1].equals("divingsuit")) {

				}
				if (option[1].equals("rope")) {

				}
				// ......Add more options if you need
			}
			if (option[0].equals("pick")) {
				if (option[1].equals("flare")) {}
				if (option[1].equals("divingsuit")) {}
				if (option[1].equals("rope")) {}
				if (option[1].equals("shovel")) {}
				if (option[1].equals("food")) {}
				//......Add more options if you need
			}
			if (option[0].equals("load")) {
				if (option[1].equals("filename")) {}
				
				//......Add more options if you need
			}
			if (option[0].equals("save")) {
				if (option[1].equals("filename")) {}
				//......Add more options if you need
			}
		}
	}
}