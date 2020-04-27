/* a Class that has the Explorer method implemented
@author Achrefmekni
*/
package Icefield;

public class Explorer extends Figure{

	public Explorer(String Name, int Health, int SkillsCount, int ItemsCount,Player player) {
		super(Name, Health, SkillsCount, ItemsCount,player);
	}
	
	
	public void showOnGUI()
	{
		// Logic: show this object in GUI
	}

	// i added a parameter because the function needs to receive an iceberg :
	
	public void Skill_Use(Iceberg IC1)
	{
		// Logic: Check capacity of neighboring iceberg
		System.out.println("The Iceberg Capacity =  "+ IC1.capacity);
		
		
	}
	
}


