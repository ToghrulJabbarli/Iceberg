package Icefield;

public class GameEngine {
	
	private Map map;
	
	public GameEngine(Map map)
	{
		this.map = map;
	}
	
	public Player getWinner()
	{
		// Logic: Get the winner
		return map.getPlayers().get(0);
	}
	
	public void setWinner()
	{
		// Logic: Setting up the winner based on logical operations
	}
	
	public void CellCondition()
	{
		/*Check whether stepping cell is steppable or not
		 *. If yes then step on it , if not then not(If other figure stays on it
		 *. If it's a water fall into the water)*/
	}
	

}
