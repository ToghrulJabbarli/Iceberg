/**
 * This class is a submatrix of a matrix(MAP) 
 * @author Murad Shahsuvarov & Toghrul Jabbarli
 */
package Icefield;

import java.util.List;

// Iceberg is a submatrix of a matrix(MAP)
public class Iceberg extends Matrix{
	
	
	public static Integer IcebergID = 0;
	public Integer IcebergName = 0;
	
	public Map map; // map of the game
  
	// Coordinates of the iceberg on the map
	private int x;
	private int y;
	//added by : Achref in order to use it in the Explorer class 
	public int capacity;
	// Blizzard on the iceberg
	private Blizzard blizzard;

	/**
	 * 
	 * @param IcebergID  ID of the icebergthat is need in GameEngine
	 * @param IcebergName name of the iceberg is need in GameEngine
	 * @param x Coordinates of the iceberg on the map
	 * @param y Coordinates of the iceberg on the map
	*/
	public Iceberg(int height, int width, int cap, Map map) { // map is added
		super(height, width);
		capacity=cap;
		this.map = map; // map of the game
		// Properties of Blizzard is equal to the properties of the iceberg (so location and area)
		blizzard = new Blizzard(this);
		IcebergName = IcebergID;
		System.out.print("Iceberg " + IcebergID + " has been set up\n");
		IcebergID++;
		
	}

	public Integer getX()
	{
		return x;
	}
	
	public Integer getY()
	{
		return y;
	}
	
	public boolean isFittable() // map parameter is added
	{
		// Logic: Check whether iceberg(Submatrix) is fittable into the Map(Matrix)  
		// E.g Matrix 50x50, Submatrix 60 x 50 => Not fittable , Submatrix 23x22 => Fittable
		if(map.width >= this.width && map.height >= this.height) // Furhter logic can be applied
		{
			System.out.print("Iceberg " + IcebergName + " is fit into the map.\n");
			return true;
		}
		return false;
	}
	/**
	 * Check whether iceberg(Submatrix) is fittable into the Map(Matrix)
	 * @return true if it is fittable otherwise false
	 */
	public String getName()
	{
		return "Iceberg " + IcebergName;
	}
	
	public void Fit(Map map)
	{
		// Logic: Fit the iceberg into the map if it is fittable
		// BIN PACKING ALGORITHM CAN BE APPLIED
		if(isFittable())
		{
			// Bin packing algorithms starts fitting the iceberg (submatrix)
			System.out.print("Iceberg " + IcebergName + ": Bin packing algorithm starts...\n");
		}
		
	}
}
