package Icefield;

public class Rope extends Object{

	@Override
	public void Used() {
		System.out.println("Rope was taken! ");
		used = true;
	}

	@Override
	public boolean isUsed() {
		
		// Logic: Checks whether flare is used or not
		
		return used;
	}

	
	public void Use(Figure rescuing_figure) {
		
		if(owner.used)
			rescuing_figure.Move(0,0);
		System.out.println("The figure has been rescued successfully !");
		
	}
	

	

}
