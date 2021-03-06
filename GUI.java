/**
 * This is class is used to draw User Interface
 * @author Yifang Meng
 */


package Icefield;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class GUI {
	static final int HEIGHT=750;
	static final int WIDTH=800;
	
	JFrame jframeMain;
	JLabel playerTurn;
	
	
	// Main menus of the game which GUI class implements
	public MainMenu mainMenu;
	public Settings settings;
	public GameBoard gameBoard;
	
	// GUI of the actual game
	public Map map;
	
	/**
	 * 
	 * @param height The height of game window, virtually it's height of ice field
	 * @param width The width of game window, virtually it's width of ice field
	 */
	public GUI(int height, int width)
	{
		mainMenu = new MainMenu();
		settings = new Settings();
	}
	
	/**
	 * Show the field where game runs
	 */
	public void ShowGUI()
	{
		// Logic: Show GUI.
		// Actual Game life cycle
		jframeMain = new JFrame("Welcome to Iceberg!");
		jframeMain.setSize(WIDTH, HEIGHT);
		jframeMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframeMain.setLocationRelativeTo(null);
		jframeMain.setResizable(false);
		jframeMain.setLayout(null);
		
		playerTurn = new JLabel("Current Player", JLabel.CENTER);
		playerTurn.setFont(new Font("MicroSoft Black", Font.BOLD, 28));
		playerTurn.setForeground(Color.WHITE);
		playerTurn.setOpaque(true); // non-transparent
		playerTurn.setBackground(Color.GRAY);
		playerTurn.setBounds(200, 0, 400, 30);
		jframeMain.add(playerTurn);

		
		gameBoard = new GameBoard();
		gameBoard.setBounds(0, 100, 800, 600);
		gameBoard.setBackground(Color.GRAY);
		gameBoard.setFocusable(true); // can be focused(can be operated individually)
		gameBoard.setLayout(new FlowLayout());
		jframeMain.add(gameBoard);
		
		jframeMain.setVisible(true);
		
	}
	/**
	 * if a player wins, game ends
	 * @return If game ends, it returns true
	 */
	public boolean EndGUI()
	{
		// Logic: End GUI
		// End the GUI after game is closed
		return false;
	}
	/**
	 * Internal class, it's the actual field where players battle
	 * It derives from JPanel
	 * The whole panel(gameboard) is virtual ice field
	 * @author Yifang Meng
	 *
	 */
	@SuppressWarnings("serial") // serialVersionUID assignment is not obligatory
	class GameBoard extends JPanel implements KeyListener{
		private static final int ROW=15;
		private static final int COLUMN=20;
		
		public Iceberg[][] icebergs=new Iceberg[ROW][COLUMN];
		private static final int ICEBERG_GAP = 2;
		private static final int ICEBERG_ARC = 20;
		private static final int ICEBERG_SIZE = 38;
		
		public GameBoard() {
			initGame();
			addKeyListener(this);
		}
		
		
		/**
		 * Create icebergs randomly
		 */
		public void initGame() {
			for (int indexRow = 0; indexRow < ROW; indexRow++) {
				for (int indexCol = 0; indexCol < COLUMN; indexCol++) {
					icebergs[indexRow][indexCol] = new Iceberg(ICEBERG_SIZE,ICEBERG_SIZE, 10, map);
				}
			}
		}
		/**
		 * paint method
		 * Once the JComponent is initialized, it will be called in a loop
		 */
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			// draw each grid
			for (int i = 0; i < ROW; i++) {
				for (int j = 0; j < COLUMN; j++) {
					DrawIceberg(g, i, j);
				}
			}

			
		}
		
		/**
		 * Draw each iceberg
		 * @param g Pen needed to draw
		 * @param i 
		 * @param j
		 */
		public void DrawIceberg(Graphics g, int i, int j) {
			Graphics2D gg=(Graphics2D)g;
			
			gg.setColor(Color.GREEN);
			gg.fillRoundRect(ICEBERG_GAP + (ICEBERG_GAP + ICEBERG_SIZE) * j, ICEBERG_GAP + (ICEBERG_GAP + ICEBERG_SIZE) * i,
					ICEBERG_SIZE, ICEBERG_SIZE, ICEBERG_ARC, ICEBERG_ARC);
		}
		
		
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			switch (e.getKeyCode()) {
			case KeyEvent.VK_ENTER:
				initGame();
				System.out.println("Game Initialization");
				break;
				
			case KeyEvent.VK_A:
				mainMenu.SetPlayer();
				

			default :
				break;
			}
			repaint();
		}
		
		

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}	
	}
}
