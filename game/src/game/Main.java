package game;

import java.util.ArrayList;

public class Main {
	 public static void main(String[]args) {

		    Player player = new Player();
		    ArrayList<Inimigo>inimigos=new ArrayList<Inimigo>();
		   
		    inimigos.add(new Ilfin(500));
		    inimigos.add(new Ilfin(500));
		    inimigos.add(new Ilfin(500));
		    inimigos.add(new Ilfin(500));
		    

		    for(int i = 0; i <inimigos.size();i++) {
		    	Inimigo inimigoLocal = inimigos.get(i);
		     if(i==1) {
		    	 inimigoLocal.umDeVida();
		    	 inimigoLocal.perderVida();
		    	 
		    	 System.out.println(inimigoLocal.vida);
		    }else {
		    	System.out.println(inimigoLocal.vida);
		    }
		    }		    	
	 }

}		    
		     // System.out.println(inimigos.get(0).vida);
		    
		   			   
		   
		    	
		 



