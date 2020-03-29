package Icefield;

import java.util.List;

public class Figure extends Object{
	
	// Current Map where the figure is playing
	private static Cell[][] map_cells;
	
	// Total count of the move possibilities
	private Integer moveCount;
	
	//Ashraf: Generated Getters and Setters
	private String Name;
	//Ashraf: Generated Getters and Setters
	private int Health;
	
	private List<String> Skills;
	private int SkillsCount;
	
	private List<Object> Items;
	private int ItemsCount;
	
	public Figure(String Name,int Health,int SkillsCount, int ItemsCount)
	{
		this.Name = Name;
		this.Health = Health; 
		this.SkillsCount = SkillsCount;
		this.ItemsCount = ItemsCount;
		
		// Gets the coordinates and info of Map Cells
		this.map_cells = Map.getMapCells();
		
		// moveCount = ANY_NUMBER
	}
	
	// Adding Skill
	public void addSkill(String skill)
	{
		Skills.add(skill);
	}
	
	public void removeSkill(int index)
	{
		Skills.remove(index);
	}
	
	// Adding Item
	public void addItem(Object item)
	{
		Items.add(item);
	}
	
	public void removeItem(int index)
	{
		Items.remove(index);
	}
	
	public void IncrementHealth()
	{
		Health++;
	}
	
	public void DecrementHealth()
	{
		Health--;
	}
	
	public void IncrementSkills()
	{
		SkillsCount++;
	}
	
	public void DecrementSkills()
	{
		SkillsCount--;
	}
	
	public void IncrementsItems()
	{
		ItemsCount++;
	}
	
	public void DecrementItems()
	{
		ItemsCount--;
	}
	//I need this function to be public since I will be calling it
	public void Move(int x, int y)
	{
		// Logic: Move Figure to the cell with x and y coordinates
		System.out.println("you are at X =  : "+ x + " , Y = "+ y);
		
	}
	
	public void Step()
	{
		// Logic: Step on a particular cell based on the information you have.
		// E.g Without Show 1 step with 2 step
		// Up, Down , Right , Left is possible
		moveCount--;
	}
	
	public void EatFood()
	{
		// Logic: Eat food, increment health decrements move count
		Health++;
		moveCount--;
	}
	
	
	
	public boolean isWater()
	{
		// Logic: Checks whether cell is a water or not
		
		return true;
	}
	
	public void FallIntoWater()
	{
		// Logic: Fall into the water
		System.out.println("You Fell into Water : Use a Diving Suit or a Rope to Save yourself ");
	}
	
	public boolean HasAShowel()
	{
		// Logic: Checks whether player has a shovel or not
		return true;
	}
	
	
	
	public void Object_Use(Object obj)
	{
		// Logic: Use a particular object
	}
	
	public void Skill_Use()
	{
		// Logic: Use a particular skill
		moveCount--;
	}
//There should be a parameter here of the item collected and then some logic to add it to the Items list
	public void CollectItem()
	{
		// Logic: Collect an Item on the cell
		//Ashraf: I added this part since I need to collect the items
		
		System.out.println("Item Received");
	}
	
	public boolean search_for_item(Object ob)
	{
		if(Items.contains(ob))
			return true;
		return false;
	}
	
	public String getName()
	{
		return this.Name;
	}
	
	public void removeSnow()
	{
		// Logic: Remove snow level based on some logic e.g. if E a snow level > 0 and
		// you have a shovel
		System.out.println("Snow Removed");
	}

	public String getCellsName(int x, int y)
	{
		// Logic: Check the name of the cell
		
		return this.map_cells[x][y].name();
	}
	
	public boolean cellIsCoveredBy(int x, int y)
	{
		// Logic: Check whether the cell's with coordinates (x and y) state is snow and
		// check it's level
		
		return true;
		
	}
	
	public void getTheObject(Object object)
	{
		// Logic: If the object is visible , then retreive it
		if(object.isSeen)
		{
			Items.add(object);
			System.out.print("Object is retrieved!");
		}
	}
	
	// Checks the health of the figure in every frame
	public void checkHealth()
	{
		if(this.Health == 0)
		{
			System.out.print("Figure (" + this.Name + ")"+
		" died!");
			this.Die();
		}
	}
	
	public void Die()
	{
		// Logic: Destroy the object
		System.out.println("This Figure Died ");
	}
	//In the previous model, this function was overriden by the abstract class but I "Ashraf" have removed overriding since there is no need for it
	//It can be a separate function here. Same for isUsed below
	public void Used() {
		
		System.out.println("Figure is moved!");
		
	}

	
	public boolean isUsed() {
		// Logic: Check whether Figure is moved or not
		return false;
	}

	public int getHealth() {
		return Health;
	}

	public void setHealth(int health) {
		Health = health;
	}

	public void setName(String name) {
		Name = name;
	}

	

}
