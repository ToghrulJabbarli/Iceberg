package Icefield;

import java.io.IOException;
import java.util.Scanner;

public class Rope extends Object
{

	//all instances of this object will be the same name

	public Rope() 
	{
		this.Name = "Rope";
	}
	
	public void Use(Figure rescued_figure, String input, String output) throws IOException 
	{
		
		System.out.println("Do you want to use it? Press any key to confirm");
		WriteFile(output,"Do you want to use it? Press any key to confirm" );


		if(ReadFile (input, "use on " + rescued_figure.getName() ))
	    {
			System.out.println(rescued_figure.getName() + "has been rescued successfully !");
			this.WriteFile(output, rescued_figure.getName() + "has been rescued successfully !");

			rescued_figure.Move(0,0);
			this.used = true;

	    }
	}
}
