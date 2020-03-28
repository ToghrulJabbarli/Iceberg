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
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainMenu implements ActionListener{
	JFrame f=new JFrame();
	JButton jb1=new JButton("Enter");
	JButton jb2=new JButton("Start");
	JLabel label1 = new JLabel("Username: ");
	JTextField tf1 = new JTextField("");
	public List<Player> players=new ArrayList<Player>();
	
	public List<Player> getPlayers() {
		return players;
	}
	
	
	public String username; 
	
	public JTextField getTfName() {
		return tf1;
	}


	public void setTfName(JTextField tfName) {
		this.tf1 = tfName;
	}
	
	public static void UpdatePlayers(String username) {
		Player player=new Player(username);
		Map.players.add(player);
	}


	public void SetPlayer() {
		f.setTitle("Welcome to 2048");
		f.setSize(400, 300);
		f.setLocation(200, 240);
		f.setLayout(new FlowLayout());
		tf1.setText("");
		tf1.setPreferredSize(new Dimension(80, 30));
		f.add(label1);
		f.add(tf1);
		f.add(jb1);
		f.add(jb2);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
        jb1.addActionListener(this);
        jb2.addActionListener(this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==jb1) {
			username=tf1.getText();
			//this.UpdatePlayers(username);
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					UpdatePlayers(username);
				}
			}).start();
			System.out.println(username+" Player Added!");
			new Settings().ChooseFigures();
			tf1.setText("");
		}
		if (e.getSource()==jb2) {
			f.dispose();
		}
	}

	
}
