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
	private boolean inMenu = true;
	
	private boolean[] keys; 
	
	private VisualHandler vH;
	
	public Battlefield(int w, int h){
		setBackground(Color.black);
		gameWidth = w;
		gameHeight = h;
		mM = new MainMenu();
		inMenu = true;
		
		vH = new VisualHandler();
		
		this.addKeyListener(this);
		new Thread(this).start();
		
		setVisible(true);
	}
	
	public void update(Graphics window){
		paint(window);
	}
	
	private BufferedImage back;
	
	public void paint(Graphics window){
		Graphics2D newGraphics = (Graphics2D) window;
		
		if (back == null){
			back = (BufferedImage)(createImage(getWidth(),getHeight()));
		}
		
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLUE);
		graphToBack.fillRect(0,0,gameWidth,gameHeight);
		
		newGraphics.drawImage(back, null, 0, 0);
	}

	public void tileImage(int x, int y, int width, int height, int imageW, int imageH, String imageName){
		int imageArea = imageW*imageH;
		int totalArea = width*height;
		
		
		
	}
	
	
	
	@Override
	public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
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
