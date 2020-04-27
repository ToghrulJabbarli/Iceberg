/** a Class that has the Eskimo method implemented
* @author Achref mekni
*/

package Icefield;

public class Eskimo extends Figure{
	
	public Eskimo(String Name, int Health, int SkillsCount, int ItemsCount,Player player) {
		super(Name, Health, SkillsCount, ItemsCount,player);
	}

	@Override
	public void Skill_Use() throws IOException
	{
		// Logic: build igloo
		Igloo ig= new Igloo();
		if (ig.used==true)
			System.out.println("You Cannot Use the Skill");
		
		//logic to build the igloo ( position on the map )
		// depends on mouse position 
		ig.Use();
		System.out.println("Igloo is built ");
	}
	

}

