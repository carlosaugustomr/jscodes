package ff;

import java.util.Scanner;

public class fdd {

	public static void main(String[] args) {
		
		try (Scanner gelo = new Scanner(System.in)) {
			float cs,g;
			System.out.println("digite um valor: ");
			cs=gelo.nextFloat();
		
		g=cs*0.25f; 
		System.out.println("o valor de 25% é :"+g);
		}
	
	}

}
