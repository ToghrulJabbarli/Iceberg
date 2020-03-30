/* a Class that controls the Game status 
@author Achrefmekni
*/

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
	//Ashraf: I added the attribute player which is the winner
	//Ashraf: I made it static. There two ways here, later with the whole game integrated and this part is instantiated we can remove static
	public static void setWinner(Player player)
	{
		// Logic: Setting up the winner based on logical operations
		System.out.println(" The winner is : " + player.getName());
	}
	
	public void CellCondition()
	{
		/*Check whether stepping cell is steppable or not
		 *. If yes then step on it , if not then not(If other figure stays on it
		 *. If it's a water fall into the water)*/
		System.out.println("The Cell is Steppable ");
	}
	

}
