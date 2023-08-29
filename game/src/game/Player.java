package game;

public class Player {
	   public int vida = 100;
	    public String nome = "cu_nene";
	    public int idade = 101;

	    public void perderVida(){
	    	if(vida<=0) {
	    		vida=0;
	    	}else {
	    vida--;
	    	}
	    }
	    public void ganharVida() {
	    	if(vida>=100) {
	    		vida=100;
	    	}else{
	    		    	
	    	vida++;
	    	}
	        
	    }

}
