package Icefield;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Settings {
	JFrame jf =new JFrame("Choose Figures");
	JButton eskimoButton=new JButton("+");
	JButton explorerButton=new JButton("+");
	JLabel labelEskimo=new JLabel("Eskimo");
	JLabel labelExplorer=new JLabel("Explorer");
	JButton doneButton=new JButton("DONE");
	
	public Settings() {
		eskimoButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("You chosed one Eskimo Figure!");
				/*
				 * new Thread(new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						UpdateFigures(new Eskimo("Eskimo", 5, 4, 0));
					}
				}).start();
				 */
			}
		});
		explorerButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("You chosed one Explorer Figure!");
				/*
				 * new Thread(new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						UpdateFigures(new Explorer("Explorer", 4, 4, 0));
					}
				}).start();
				 */
			}
		});
		doneButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				jf.dispose();
				
			}
		});
		
	}
	
	public static void UpdateFigures(Figure figure) {
		int numPlayers=Map.players.size();
		if (numPlayers==0) {
			Map.players.get(0).figures.add(figure);
		}
		else {
			Map.players.get(numPlayers-1).figures.add(figure);
		}
	}
	
	public void ChooseFigures() {
		
		jf.setVisible(true);
		Box box1=Box.createHorizontalBox();
		box1.add(labelEskimo);
		box1.add(eskimoButton);
		
		
		Box box2=Box.createHorizontalBox();
		box2.add(labelExplorer);
		box2.add(explorerButton);
		
		Box box3=Box.createVerticalBox();
		box3.add(box1);
		box3.add(box2);
		box3.add(doneButton);
		
		jf.setBounds(600, 200, 300, 220);
		jf.setContentPane(box3);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
