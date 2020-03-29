package Icefield;

import java.awt.Dimension;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * Window for players set-up
 * @author Yifang Meng
 *
 */
public class MainMenu implements ActionListener{
	JFrame f=new JFrame();
	JButton jbEnter=new JButton("Enter");
	JButton jbStart=new JButton("Start");
	JLabel label1 = new JLabel("Username: ");
	JTextField tf1 = new JTextField("");
	public static List<Player> temPlayers=new ArrayList<Player>();
	
	
	public String username; 
	
	public JTextField getTfName() {
		return tf1;
	}


	public void setTfName(JTextField tfName) {
		this.tf1 = tfName;
	}
	/**
	 * 
	 * @param username Add a new player with username as name
	 */
	public static void UpdatePlayers(String username) {
		Player player=new Player(username);
		temPlayers.add(player);
	}

	/**
	 * Window initialization
	 */
	public void SetPlayer() {
		f.setTitle("Welcome to 2048");
		f.setSize(400, 300);
		f.setLocation(200, 240);
		f.setLayout(new FlowLayout());
		tf1.setText("");
		tf1.setPreferredSize(new Dimension(80, 30));
		f.add(label1);
		f.add(tf1);
		f.add(jbEnter);
		f.add(jbStart);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		jbEnter.addActionListener(this);
        jbStart.addActionListener(this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==jbEnter) {
			username=tf1.getText();
			
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					UpdatePlayers(username);
				}
			}).start();
			
			/*
			 * System.out.println("Current Players: ");
			Iterator<Player> iterator=temPlayers.iterator();
			while (iterator.hasNext()) {
				Player player = (Player) iterator.next();
				System.out.println(player.getName());
				
			}
			 */

			System.out.println(username+" Player Added!");
			new Settings().ChooseFigures();
			tf1.setText("");
		}
		if (e.getSource()==jbStart) {
			f.dispose();
			Map.players.addAll(temPlayers);
			int i=1;
			Iterator<Player> iterator=Map.players.iterator();
			while (iterator.hasNext()) {
				Player player = (Player) iterator.next();
				System.out.println("Player "+i+": "+player.getName());
				i++;
			}
		}
	}

	
}
