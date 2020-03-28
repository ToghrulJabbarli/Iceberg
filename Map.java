package Icefield;

import java.util.ArrayList;
import java.util.List;

public class Map extends Matrix{
	
	    // Cells of the matrix each of which has its own state
		private static Cell Map[][];
		
		private Iceberg[] icebergs;
		
		// List of snow cells with coordinates
		private List<Snow> snowList;
		
		// List of players 
		static List<Player> players;
		
		// Number of players on the map = size of players
		private Integer numberOfPlayers;
		
		
		public void showOnGUI(GUI gui, Map map)
		{
			// Logic: show this object in GUI
		   gui.SetMap(map);
		   System.out.print("Map is set in the GUI! \n");
			
		}
		
		public Map(int height, int width,List<Player> players)
		{
			super(height,width);
			
			// Setting up the size of the matrix to the area
			Map = new Cell[height][width];
			
			// Setting up the players on the map
			players = new ArrayList<Player>();
			
			System.out.print("Map and Players are set!");
		}
		
		
		public static Cell[][] getMapCells()
		{
			return Map;
		}
		
		public static List<Player> getPlayers()
		{
			return players;
		}
		
		public String getCellInfo(int x, int y)
		{
			// Returning the name of the cell's state
			return Map[x][y].name(); 
			
		}
		
		public void FillObject(Object object) {
		
			// Logic: Fill the object to the cell of the matrix
			System.out.print("Object is filled! ");
			
		}
		
		void SetIcebergs(Iceberg[] icebergs)
		{
			this.icebergs = icebergs;
		}
		
		void GenerateIcebergsOnMap()
		{
			
			if(icebergs.length != 0)
			{
				for(int i = 0; i < icebergs.length; i++)
				{
					// Logic: Generate Iceberg (Submatrices) on the map (Matrix)
					System.out.println("Iceberg " + icebergs[i].getName() +  " is generated!");
				}
			}
			
		}

}
