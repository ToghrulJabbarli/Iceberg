package Icefield;

public class Igloo extends Object{

	@Override
	public void Used() {
		System.out.println("Igloo was set!");
		used = true;
	}
	@Override
	public boolean isUsed() {
		// Logic: Checks whether igloo is used or not
		return used;
	}
	
public void Use() {
		
		// Logic
	
		if(this.used) {
			//keeps health the same during all the blizzard
			//During all the blizzard, the figure can call this function to save his health
			System.out.println("Igloo has been built. Owner of this Igloo shall not feel any pain during this blizzard.")
			owner.set_health(owner.get_health());
			owner.Skill_Use();
		}
	}


}
