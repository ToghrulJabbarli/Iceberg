package Icefield;

public class Food extends Object {

	@Override
	public void Used() {
		System.out.println("Food was taken!");
		used = true;
	}
	@Override
	public boolean isUsed() {
		// Logic: Checks whether food is used or not
		return used;
	}
	
public void Use() {
		
		// Logic
	if(used)
		owner.EatFood();
	System.out.println("Food is used and your health is now"+ owner.get_health());

	}
}
