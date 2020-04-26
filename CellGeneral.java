package Icefield;

public class CellGeneral {
	
	public int snowLevel = 0;
	public Cell cell;
	
	
	public void RunBlizzard() {
		snowLevel++;
	}
	
	
	public void digSnow() {
		if(snowLevel > 0) {
			snowLevel--;
		}	
	}

}
