package iceberg;

import java.util.ArrayList;
import java.util.List;

public class StartProgram {

	public static void main(String[] args) throws Throwable {
		
		// TODO Auto-generated method stub
		/**
		 * Yifang Meng test part
		 * Testers press 'A' once ice field is loaded, at this moment it looks like many green grids
		 * Then tester input name and click "Enter" button, Setting window is shown in which tester can choose figures to control
		 * Once figure is chosen, click "Done" button then another player can join and repeat above steps
		 * If all players are set, tester can click "Start" button then MainMenu and Setting windows disappear and game starts
		 */
		
		/*
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
		*/
	
	//Comment the previous part before starting here as this part is different separate scenarios that would be integrated later to make the sense of game.
	//	-------------------------------------------------------------------------------------------------------------------------------
	// During Testing, please test each object separately since each object represents a single separate scenario that only one can happen per MOVE
		//Figure figure1 = new Figure("Ashraf", 5, 2,4);
		//Figure figure2 = new Figure("Murad", 4,2 ,5);
		
		/*
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
		snow1.BuildingSnow();*/
               
		
		//Achref Testing Part : 
		
		//Testing Eskimo + Explorer :
		List<Player> players = new ArrayList<Player>();
		Player player_1 = new Player("Murad");
		
		Map map = new Map(25,25,players);
		Rope rp = new Rope();
		String name1;
		Iceberg ic1= new Iceberg(20,15,10,map);
		Explorer ex = new Explorer("Achref",10,4,3);
		ex.Skill_Use(ic1);
		name1 = ex.getName();
		System.out.println(name1);
		
		// when a Figure Falls into water :
		Eskimo es = new Eskimo("Ali",10,4,3);
		es.Skill_Use();
	    es.CollectItem(rp); 	
		es.FallIntoWater(es);
		
		//Testing Game engine
		GameEngine ge = new GameEngine(map);
		if(ex.getHealth()>0 & es.getHealth()>0)
			ge.setWinner(player_1);
		
		// when Health goes 0 :
		for (int i=0;i<10;i++)
			es.DecrementHealth();
		
		
			es.checkHealth();
		
		// Removing Snow :
		Shovel sh = new Shovel();
		Snow sn = new Snow(5,4,25);
		es.addItem(sh);
		sn.BuildingSnow();
		es.removeSnow(sn,10);
		
		
		
		
		
		
		
		
		
		
	}

}
