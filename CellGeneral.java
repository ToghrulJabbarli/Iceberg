package Icefield;

public class CellGeneral {
	
	public int snowLevel = 0;
	public Cell cell;
	
	public CellGeneral() {
		snowLevel = 0;
		cell = Cell.EMPTY;
	}
	
	
	public void RunBlizzard() {
		snowLevel++;
	}
	
	
	public void digSnow() {
		if(snowLevel > 0) {
			snowLevel--;
		}	
	}

}
