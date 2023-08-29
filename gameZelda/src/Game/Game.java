package Game;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

public class Game  extends Canvas implements Runnable, KeyListener  {
	public Player player;
	public static int WIDTH=480,HEIGHT=480;//tamanho da janela
	public  Word word;
	public Game () {
		this.addKeyListener(this);
		this.setPreferredSize(new Dimension (WIDTH , HEIGHT ));
		player=new Player(32,32); 
		word=new Word();
	
	}
	public void tick() {
		player.tick();
		
	}
	public void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if(bs==null) {
			this.createBufferStrategy(3);
			return;
			
		}
		Graphics g = bs.getDrawGraphics();

        g.setColor(Color.GRAY);
        g.fillRect(0,0 , WIDTH , HEIGHT);
        player.render(g);
        word.render(g);
        bs.show();
		
	}
	public static void main(String[]args) {
		Game game = new Game();
		JFrame frame = new JFrame();
		
		frame.add(game);         
		frame.setTitle("MiniZelda");         
		frame.pack();         
		frame.setLocationRelativeTo(null);         
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
		frame.setVisible(true);
		
		new Thread(game).start();
		
	
		
	} 
    //Loop_tela
	@Override
	public void run() { 
		while(true) { 
			tick();
			render();
			try {
				Thread.sleep(1000/60);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
	        player.right = true;
	        }else if(e.getKeyCode()==KeyEvent.VK_LEFT) {
	            player.left = true;
	        }
	        if(e.getKeyCode()==KeyEvent.VK_DOWN) {
	            player.down = true;
	        }else if(e.getKeyCode()==KeyEvent.VK_UP) {
	                player.up = true;
	        }//movimetação correta
	}
	@Override
	public void keyReleased(KeyEvent e) {
		
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
	        player.right = false;
	        }else if(e.getKeyCode()==KeyEvent.VK_LEFT) {
	            player.left = false;
	        }
	        if(e.getKeyCode()==KeyEvent.VK_DOWN) {
	            player.down = false;
	        }else if(e.getKeyCode()==KeyEvent.VK_UP) {
	                player.up = false;
	        }
	}//movimetação correta

	
}
