package Icefield;

public class Explorer extends Figure{

	public Explorer(String Name, int Health, int SkillsCount, int ItemsCount) {
		super(Name, Health, SkillsCount, ItemsCount);
	}
	
	@Override
	public void showOnGUI()
	{
		// Logic: show this object in GUI
	}

	@Override
	public void Skill_Use()
	{
		// Logic: Check capacity of neighboring iceberg
	}
	
}
