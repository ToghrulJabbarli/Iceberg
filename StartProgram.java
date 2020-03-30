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
	public static void Snow_removing(Figure es) 
	{
		Shovel sh = new Shovel();
		Snow sn = new Snow(5,4,25);
		es.addItem(sh);
		sn.BuildingSnow();
		es.removeSnow(sn);
	}
    
	public static void HealthManag(Figure es) throws Throwable
	{
		for (int i=0;i<10;i++)
			es.DecrementHealth();
		 
		es.checkHealth();
	}
	
	public static void Falls_intoWater(Figure es) throws Throwable
	{
		Rope rp = new Rope();
		
	    es.CollectItem(rp); 	
		es.FallIntoWater(es);
	}

    public static void 	Explorer_UseSkill(Explorer ex, Map map1)
    {
    	Iceberg ic1= new Iceberg(20,15,10,map1);
		ex.Skill_Use(ic1);
    }
    
    public static void Eskimo_UseSkill(Eskimo es )
    {
    	es.Skill_Use();
    }
    
    public static void GameEngine_Test(GameEngine ge,Figure es,Figure ex,Player p)
    {
    	
		if(ex.getHealth()>0 & es.getHealth()>0)
			ge.setWinner(p);
    }
	public static void Achref_Test() throws Throwable 
	{
		List<Player> playerss = new ArrayList<Player>();
		Player player_3 = new Player("Murad");
		Map map1 = new Map(25,25,playerss);
		Eskimo es = new Eskimo("Ali",10,4,3);
		Explorer ex = new Explorer("Achref",10,4,3);
		GameEngine ge = new GameEngine(map1);
		while(true) {
			Scanner input=new Scanner(System.in);
			String result=input.next();
			int choice=Integer.valueOf(result);
			
		
		switch(choice) {
			case 1: Snow_removing(es);
			break;
			case 2: Explorer_UseSkill(ex,map1);
			break;
			case 3: Eskimo_UseSkill(es);
			break;
			case 4: GameEngine_Test(ge,es,ex,player_3);
			break;
			case 5: HealthManag(es);
			break;
			case 6: Falls_intoWater(es);
			break;
		}
		}
		
		
		
	}

	public static void MuradandToghrulTest() {
		System.out.println(" --------------------MURAD & TOGHRUL------------------- \n");
		
		
		List<Player> players = new ArrayList<Player>();
		Player player_1 = new Player("Murad");
		Player player_2 = new Player("Toghrul");
		players.add(player_1);
		players.add(player_2);
		
		
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
		
	}
	
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
		
		Snow snow1 = new Snow(3,4 ,3);
		snow1.BuildingSnow();
		
		Shovel shovel1 = new Shovel();
		shovel1.Used(shovel1, figure1);
		shovel1.Use(snow1);
		
		
		
	
	
	public static void main(String[] args) throws Throwable {
		
		// TODO Auto-generated method stub
		System.out.println("Please enter a number: ");
		System.out.println("1: Murad and Togrul");
		System.out.println("2: Ashraf");
		System.out.println("3: Achref");
		System.out.println("4: Yifang---GUI");
		System.out.println("If you want to test GUI, test it first. Then restart program and test others...");
		while(true) {
			Scanner input=new Scanner(System.in);
			String result=input.next();
			int choice=Integer.valueOf(result);
			if (choice==1) {
				MuradandToghrulTest();
			}
			if (choice==2) {
				AshrafTest();
			}
			if (choice==3) {
				Achref_Test();
			}
			if (choice==4) {
				break;
			}
		}
		YifangTest();
	}

}
