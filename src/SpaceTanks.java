import javax.swing.JFrame;
import javax.swing.JWindow;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;

public class SpaceTanks extends JFrame {
	private int width;
	private int height;
	
	public SpaceTanks(){
		super("SPACE TANKS");

		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setUndecorated(true);
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		width = (int) screenSize.getWidth();
		height = (int) screenSize.getHeight();
		
		System.out.println(width + " " + height);
		
		setSize(width, height);
		
		Battlefield game = new Battlefield(width, height);
		
		add(game);
		
		setVisible(true);
	}
	
	public static void main( String args[] )
	{
		SpaceTanks run = new SpaceTanks();
	}
	
}
