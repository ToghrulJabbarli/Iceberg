/**
 * This class is a submatrix of a matrix(MAP) 
 * @author Murad Shahsuvarov & Toghrul Jabbarli
 */
package Icefield;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Iceberg is a submatrix of a matrix(MAP)
public class Iceberg extends Matrix{
	
	
	public static Integer IcebergID = 0;
	public Integer IcebergName = 0;
	
	public Map map; // map of the game
  
	// Coordinates of the iceberg on the map
	public List<Point> points;
	
	
	//added by : Achref in order to use it in the Explorer class 
	public int capacity;
	// Blizzard on the iceberg
	/**
	 * 
	 * @param IcebergID  ID of the icebergthat is need in GameEngine
	 * @param IcebergName name of the iceberg is need in GameEngine
	 * @param x Coordinates of the iceberg on the map
	 * @param y Coordinates of the iceberg on the map
	*/
	public Iceberg(int height, int width,List<Point> cords, int cap) { // map is added
		super(height, width);
		capacity=cap;
		this.map = map; // map of the game
		
		// Properties of Blizzard is equal to the properties of the iceberg (so location and area)
		IcebergName = IcebergID;
		
		points = new ArrayList<Point>();
		points  = cords;

		
		System.out.print("Iceberg " + IcebergID + " has been set up\n");
		IcebergID++;
		
	}
	
	public void setMap(Map map) {
		this.map = map;
	}
	
	public void print() {
		System.out.print("ID: " + this.IcebergName + "\n" +
	"NAME: " + this.getName() + "\n\n" 
	+ "CAPACITY: " + this.capacity + "\n");
		System.out.print("POINTS: \n");
		for(int i = 0; i < this.points.size(); i++) {
			System.out.println("(" + this.points.get(i).X + "," + this.points.get(i).Y + ")");
		}
	}
	
	/**
	 * Check whether iceberg(Submatrix) is fittable into the Map(Matrix)
	 * @return true if it is fittable otherwise false
	 */
	public String getName()
	{
		return "Iceberg " + IcebergName;
	}
	
	

}