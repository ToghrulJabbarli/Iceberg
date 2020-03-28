package Icefield;

public class Blizzard extends Matrix{
	
	Iceberg iceberg;

	// Coordinates of the Blizzard
	public Blizzard(Iceberg iceberg) {
		super(iceberg.height, iceberg.width);
		this.iceberg = iceberg;
	}
	
	public void StartBlizzard()
	{
		// Logic: Start the Blizzard, Increment number of snow on the iceberg
		System.out.print("Blizzard stars on (" + iceberg.getX() + " , " + iceberg.getY() + ")" );
	}
	
	public void StopBlizzard()
	{
		// Logic: Stop the Blizzard
		System.out.print("Bilard stops!");
	}
	

}
