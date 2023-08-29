package porFavor;
import java.util.Scanner;

public class cmd {
 
	public static void main(String[] args) {
		    try (Scanner gelo = new Scanner (System.in)) {
				float nota1,nota2,media,media2; 
				
				System.out.println("caculadora de quadrado");
				
				System.out.println("digite valor do 1º");
				nota1 = gelo.nextFloat();
				
				System.out.println("digite valor do 2º");
				nota2 = gelo.nextFloat();
				
				

				media = (2*nota1+2*nota2);
				media2 = (nota1*nota2);
			 
			
			System.out.println("A perimetro é de  : "+ media);
			System.out.printf("A area é de  : "+ media2+"m²");
		    
		}
		    
	}
	
}
		    
