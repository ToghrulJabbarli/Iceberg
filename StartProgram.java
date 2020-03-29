package Icefield;

import java.util.ArrayList;
import java.util.List;

public class StartProgram {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/**
		 * Yifang Meng test part
		 * Testers press 'A' once ice field is loaded, at this moment it looks like many green grids
		 * Then tester input name and click "Enter" button, Setting window is shown in which tester can choose figures to control
		 * Once figure is chosen, click "Done" button then another player can join and repeat above steps
		 * If all players are set, tester can click "Start" button then MainMenu and Setting windows disappear and game starts
		 */
		GUI gui=new GUI(GUI.HEIGHT, GUI.WIDTH);
		System.out.println("Welcome to Iceberg!");
		System.out.println("Press 'A' to add Player");
		gui.ShowGUI();
		
		// Called by Murad & Toghrul
		// MAP 
		System.out.println(" --------------------MURAD & TOGHRUL------------------- \n");
		List<Player> players = new ArrayList<Player>();
		Player player_1 = new Player("Murad");
		Player player_2 = new Player("Toghrul");
		players.add(player_1);
		players.add(player_2);
		Map.players.addAll(players);
		
		
		Map map = new Map(25,25,players);
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
		System.out.println("\n");
		
		
	}

}
