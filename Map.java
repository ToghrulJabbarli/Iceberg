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
		static List<Player> players=new ArrayList<Player>();
		
		// Number of players on the map = size of players
		private Integer numberOfPlayers;
		
		
		public void showOnGUI()
		{
			// Logic: show this object in GUI
		}
		
		public Map(int height, int width,List<Player> players)
		{
			super(height,width);
			
			// Setting up the size of the matrix to the area
			Map = new Cell[height][width];
			
			// Setting up the players on the map
			players = new ArrayList<Player>();
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
			
		}
		
		private void GenerateIcebergsOnMap()
		{
			// Logic: Generate Iceberg (Submatrices) on the map (Matrix)
		}

}
