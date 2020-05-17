/**
 * Main Matrix class
 * @author Murad Shahsuvarov & Toghrul Jabbarli
 */
package Icefield;

import java.util.ArrayList;
import java.util.List;

public class Map extends Matrix{
	
	    // Cells of the matrix each of which has its own state
		protected static CellGeneral Map[][];
		
		// BLIZZARD OCCURANCE
		public static int blizzard_counter = 0;
		
		private List<Iceberg> icebergs;
		
		// List of snow cells with coordinates
		private List<Snow> snowList;
		
		// List of players 
		static List<Player> players=new ArrayList<Player>();
		
		// Number of players on the map = size of players
		private Integer numberOfPlayers;
		
		
		public Map(int height, int width,List<Player> _players, List<Iceberg> icebergs)
		{
			super(height,width);
			
			// Setting up the size of the matrix to the area
			this.Map = new CellGeneral[height][width];
			for(int i = 0; i < this.Map.length; i++) {
				for(int j = 0; j < this.Map[0].length; j++) {
					this.Map[i][j] = new CellGeneral(false);
				}
			}
			
			// Setting up the players on the map
			this.players = _players;
			
			this.icebergs = icebergs;
			
		}
		public Map(int height, int width)
		{
			super(height,width);
			
			// Setting up the size of the matrix to the area
			this.Map = new CellGeneral[height][width];
			for(int i = 0; i < this.Map.length; i++) {
				for(int j = 0; j < this.Map[0].length; j++) {
					this.Map[i][j] = new CellGeneral(false);
				}
			}			
			
		}
		
		public static CellGeneral[][] getMapCells()
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
			return Map[x][y].cell.name(); 
			
		}
		
		private boolean tileIsAvailable(int x, int y) {
			if((Map[x][y].equals(Cell.FIGURE) 
					|| Map[x][y].equals(Cell.ESKIMO)
					|| Map[x][y].equals(Cell.EXPLORER)) && Map[x][y].equals(Cell.ICEBERG) ) {
				return false;
			}
				return true;
			
		}
		
		public void FillFigure(Figure figure, int x, int y) {
			if(tileIsAvailable(x,y)) {
				Map[x][y].cell = figure.getState();
			}else if(!tileIsAvailable(x,y)){
				System.out.printf("Tile x=" + x +
						",y=" + y + " is not available!");
			}
		}
		
		public boolean cellAlreadyContainsAnObject(int x, int y) {
			if((this.Map[x][y].equals(Cell.CHARGE) ||
					this.Map[x][y].equals(Cell.DIVING_SUIT) ||
					this.Map[x][y].equals(Cell.FLARE) ||
					this.Map[x][y].equals(Cell.FOOD) ||
					this.Map[x][y].equals(Cell.GUN) ||
					this.Map[x][y].equals(Cell.IGLOO) ||
					this.Map[x][y].equals(Cell.ROPE) ||
					this.Map[x][y].equals(Cell.SHOVEL)) && this.Map[x][y].equals(Cell.ICEBERG)) {
				return false;
			}
			
			return true;
		}
		public void FillObject(Object object, int x, int y) {
		
			// Logic: Fill the object to the cell of the matrix
			if(cellAlreadyContainsAnObject(x,y)) {
				System.out.print("Can't fill an object into x="
						+ x + ",y=" + y + " cell.\n");
				return;
			}
			
			Map[x][y].cell = object.getState();
			System.out.print("Object is filled into "
					+ x + ",y=" + y + " cell.\n");
			
			
		}
		

		void GenerateIcebergsOnMap()
		{
			
			if(icebergs.size() != 0)
			{
				System.out.println("\nICEBERGS COUNT: " + icebergs.size());
			int numberOfIcebergs = icebergs.size();
			int TotalAreaOfIcebergs = 0;
			for(int i = 0; i < numberOfIcebergs; i++) {
				TotalAreaOfIcebergs += this.icebergs.get(i).height * this.icebergs.get(i).width;
			}
			
			if(TotalAreaOfIcebergs > this.height * this.width) {
				System.out.print("Total area of icebergs is greater than the area of the map."
						+ "\n"
						+"Area of the map: " + this.height * this.width + "\n" 
						+ "Total area of all icebergs: " + TotalAreaOfIcebergs);
				return;
			}
			
			
				for(int i = 0; i < icebergs.size(); i++)
				{
					// Logic: Generate Iceberg (Submatrices) on the map (Matrix)
					for(int j = 0; j < icebergs.get(i).points.size(); j++) {
						try {
							this.Map[icebergs.get(i).points.get(j).X][icebergs.get(i).points.get(j).Y].cell = Cell.ICEBERG;
						}catch(Exception e) {
							System.out.print("\nThe point ("+icebergs.get(i).points.get(j).X + "," + icebergs.get(i).points.get(j).Y + ") is null!\n");
		
						}
						
					}
					    System.out.println("Iceberg " + icebergs.get(i).getName() +  " is generated!");
					}
					
				}else {
					System.out.println("\nICEBERGS COUNT: " + icebergs.size());
				}
			}
		
		public void TriggerBlizzard() {
			for(int i = 0; i < this.Map.length; i++) {
				for(int  j = 0; j < this.Map[0].length; j++) {
					try {
						if(this.Map[i][j].cell.equals(Cell.ICEBERG)) {
							Map[i][j].snowLevel++;
						}
					} catch(Exception e) {
						String crd = "(" + i + "," + j + ")";
						System.out.println("ERROR " + crd + ": " + e);
					}
				 }
			 }
			
			for(int i = 0; i < this.Map.length; i++) {
				for(int  j = 0; j < this.Map[0].length; j++) {
					try {
						if(this.Map[i][j].cell.equals(Cell.ICEBERG)) {
							System.out.println("Snow level ("+i+","+j+") is " + Map[i][j].snowLevel);
						}
					} catch(Exception e) {
						String crd = "(" + i + "," + j + ")";
						System.out.println("ERROR " + crd + ": " + e);
					}
				 }
			 }
		 }
		
		
		public void printMap() {
			System.out.print("\n");
			for(int i = 0; i < this.Map.length; i++) {
				for(int j = 0; j < this.Map[0].length; j++) {
					System.out.print(getCellInfo(i,j) + " ");
				}
				System.out.print("\n");
			}
		}
		
		public void printMapSnowLevel() {
			System.out.print("\n");
			for(int i = 0; i < this.Map.length; i++) {
				for(int j = 0; j < this.Map[0].length; j++) {
					System.out.print(this.Map[i][j].snowLevel + " ");
				}
				System.out.print("\n");
			}
		}
	 }