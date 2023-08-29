package game;

public class Inimigo {
    
    public int vida = 500;
    public String nome = "Zumbi";
    public int ataque =10;
    public Inimigo(int vida) {
    	this.vida = vida;
    }
    
    
    public void getvida() {
    	
    	 vida=500;
    }
    public void perderVida(){
    	if(vida<=0) {
    		vida=0;
    	}else {
    vida--;
    	}
    }
    public void umDeVida() {
    	if(vida>=500) {
    		vida=500;
    	}else{
    		    	
    	vida++;
    	}
    }
}
	 

