package Icefield;

import java.util.List;

// Iceberg is a submatrix of a matrix
public class Iceberg extends Matrix{
	
	// Coordinates of the iceberg on the map
	private int x;
	private int y;
	//added by : Achref in order to use it in the Explorer class 
	public int capacity;
	// Blizzard on the iceberg
	private Blizzard blizzard;

	public Iceberg(int height, int width, int cap) {
		super(height, width);
		capacity=cap;
		// Properties of Blizzard is equal to the properties of the iceberg (so location and area)
		blizzard = new Blizzard(height, width, x, y);
	}

	public boolean isFittable()
	{
		// Logic: Check whether iceberg(Submatrix) is fittable into the Map(Matrix)
		// E.g Matrix 50x50, Submatrix 60 x 50 => Not fittable , Submatrix 23x22 => Fittable
		return true;
	}
	
	public void Fit(Map map)
	{
		// Logic: Fit the iceberg into the map if it is fittable
	}
}
