package Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Player extends Rectangle{
	
	public int spd=4;
	public boolean right,up,down,left;
	
	public Player(int x, int y){
		super(x,y,32,32);
		
		}
	
	public void tick(){
		if(right && Word.isFree(x+spd,y))  {
			x+=spd;
		}else if(left && Word.isFree(x-spd,y)) {
		x-=spd;
	}
		if(up && Word.isFree(x,spd-y)) {
			y-=spd;
		}else if(down && Word.isFree(x,spd+y)) {
		y+=spd;
		
		}
	}
	


	public void render(Graphics g ){ 
		
		g.setColor(Color.blue);
    
		g.fillRect(x, y, width, height);
		
	}
}
