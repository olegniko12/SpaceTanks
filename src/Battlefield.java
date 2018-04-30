import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Battlefield extends Canvas implements KeyListener, Runnable
{
	private int gameWidth;
	private int gameHeight;
	
	private MainMenu mM;
	
	public Battlefield(int w, int h){
		setBackground(Color.black);
		gameWidth = w;
		gameHeight = h;
		mM = new MainMenu();
		mM.drawMenu(window, gameWidth, gameHeight);
	}
	
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
	
}
