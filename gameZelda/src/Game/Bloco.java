package Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Bloco extends Rectangle{
	
	
	
	public Bloco(int x, int y) {
		super(x,y,32,32);
	}
		
	public void render(Graphics g) {
		g.setColor(Color.red);
	    
		g.fillRect(x, y, width, height);
		
		g.setColor(Color.black);
		
		g.drawRect(x, y, width, height);
	}



}
