/* a Class that has Figures Methods
@author Achrefmekni
*/

package Icefield;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Figure extends Object{
	
	// Current Map where the figure is playing
	private static CellGeneral[][] map_cells;
	protected Cell STATE;
	private Point currentposition;
	// Total count of the move possibilities
	private Integer moveCount;
	
	//Ashraf: Generated Getters and Setters
	private String Name;
	//Ashraf: Generated Getters and Setters
	private int Health;
	private Player owner_player;
	private List<String> Skills;
	private int SkillsCount;
	
	private List<Object> Items=new ArrayList<Object>();
	private int ItemsCount;
	
	public Figure(String Name,int Health,int SkillsCount, int ItemsCount, Player player)
	{
		this.Name = Name;
		this.Health = Health; 
		this.SkillsCount = SkillsCount;
		this.ItemsCount = ItemsCount;
		this.owner_player=player;
		this.currentposition=new Point(0,0);
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
		System.out.println(map_cells[x][y].cell.name());
		System.out.println("you are at X =  : "+ x + " , Y = "+ y);
		
	}
	// i added 2 params x and y to check the cell 
	public void Step(int x , int y)
	{
		// Logic: Step on a particular cell based on the information you have.
		// E.g Without Show 1 step with 2 step
		// Up, Down , Right , Left is possible
		if(cellIsCoveredBy(x,y)== false)
			moveCount--;
		moveCount-=2;
		
	}
	
	public void EatFood()
	{
		// Logic: Eat food, increment health decrements move count
		Health++;
		moveCount--;
	}
	
	// i added the (x,y) coordinates of the cell 
	
	public boolean isWater(int x, int y)
	{
		// Logic: Checks whether cell is a water or not
		if(map_cells[x][y].cell.name() =="WATER")
			return true;
		return false ;
	}
	
	// Achref : i added figure parameter because we need a specific figure to fall into water 
	// added throwable exception because i will destroy the object if he dies 
	public void FallIntoWater(Figure fig)throws Throwable
	{
		// Logic: Fall into the water
		try {
		Rope rp = new Rope();
		DivingSuit ds = new DivingSuit();
		System.out.println("You Fell into Water : Use a Diving Suit or a Rope to Save yourself ");
		for( int i=0 ;i<Items.size();i++) {
			if (Items.get(i).Name== rp.Name ) {
				rp.Use(fig);
				System.out.println("Saved");}
			
			else if (Items.get(i).Name==ds.Name) {
				ds.Use();
				System.out.println("Saved");}
			else
				fig.Die();
			   }}
				
		catch(NullPointerException e) {
			System.out.println("errrrorrr");
		}
				
		
	}
	
	public boolean HasAShovel()
	{
		// Logic: Checks whether player has a shovel or not
		Shovel sv=new Shovel();
		if (search_for_item(sv)==true)
			return true ;
		return false;
		
	}
	
	
	
	public void Object_Use(Object obj)
	{
		// Logic: Use a particular object
		for( int i=0 ;i<Items.size();i++) {
			if (Items.get(i).Name == obj.Name)
				removeItem(i); }
		
		DecrementItems();
		System.out.println("this "+obj.Name +" has been used");
	}
	
	public void Skill_Use() throws IOException
	{
		// Logic: Use a particular skill
		DecrementSkills();
	}
    //There should be a parameter here of the item collected and then some logic to add it to the Items list
	//i added a parameter Object it1
	public void CollectItem(Object it1)throws NullPointerException
	{
		// Logic: Collect an Item on the cell
		try {
		this.addItem(it1);
		this.IncrementsItems();
		System.out.println("Item Received");}
		catch(NullPointerException e) {
			System.out.println("errrrorrr");
		}
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
	//Achref : i ADDED  2 parameters because it needs to receive the cell position and check if it is covered or not 
	public void removeSnow(int x , int y)
	{
		// Logic: Remove snow level based on some logic e.g. if E a snow level > 0 and
		// you have a shovel
		if (this.HasAShovel())
			map_cells[x][y].digSnow();
		
		/*for (int i=0;i<Items.size();i++) {
			if(Items.get(i).Name=="SHOVEL")
				removeItem(i);
		}*/
				
		System.out.println("done");
	}

	public String getCellsName(int x, int y)
	{
		// Logic: Check the name of the cell
		
		return this.map_cells[x][y].cell.name();
	}
	
	public boolean cellIsCoveredBy(int x, int y)
	{
		// Logic: Check whether the cell's with coordinates (x and y) state is snow and
		// check it's level
		if(map_cells[x][y].snowLevel>0)
			return true;
		return false ;
		
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
	public void checkHealth() throws Throwable
	{
		if(this.Health == 0)
		{
			System.out.println("Figure (" + this.Name + ")"+
					" died!");
			this.Die();
		}
	}
	
	public void Die() throws Throwable
	{
		// Logic: Destroy the object
		finalize();
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

	// ADDED BY MURAD & TOGHRUL
		public Cell getState() {
			return this.STATE;
		}
		
		public void setPosition(int x , int y)
		{
			currentposition.X=x;
			currentposition.Y=y;
		}
		

}
