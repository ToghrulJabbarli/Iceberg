package Icefield;

import java.util.ArrayList;
import java.util.List;

public class CellGeneral {
	
	public int snowLevel = 0;
	public boolean isIceberg = false;
	public Cell cell;
	public Cell figureOnCell;
	public Cell objectOnIceberg;
	
	
	/*FIGURE,
	ESKIMO,
	EXPLORER,
	DIVING_SUIT,
	FLARE,
	GUN,
	CHARGE,
	ROPE,
	SHOVEL,
	FOOD,
	IGLOO,
	ICEBERG,
	EMPTY,
	WATER*/
	
	public CellGeneral(boolean isIceberg) {
		snowLevel = 0;
		this.isIceberg = isIceberg;
		
		if(this.isIceberg == true) {
		    cell = Cell.ICEBERG;
		    figureOnCell = Cell.EMPTY;
		    objectOnIceberg = Cell.EMPTY;
		}else if(this.isIceberg == false) {
			cell = Cell.WATER;
		}	
	}
	
	
	public void putObject(Cell cell) {
		if(objectOnIceberg.equals(Cell.EMPTY)) {
			objectOnIceberg  = cell;
		}
	}
	
	public void removeObject() {
		objectOnIceberg  = Cell.EMPTY;
	}
	//Achref : i changed it it was same as putobject which is wrong 
	public void putFigure(Cell cell) {
		if(figureOnCell.equals(Cell.EMPTY)) {
			figureOnCell  = cell;
		}
	}
	
	public void removeFigure() {
		figureOnCell = Cell.EMPTY;
	}
	
	
	
	public void RunBlizzard() {
		if(Map.blizzard_counter == 10) {
			snowLevel++;
			Map.blizzard_counter = 0;
		}	
	}
	
	
	public void digSnow() {
		if(snowLevel > 0) {
			snowLevel--;
		}	
	}

}
