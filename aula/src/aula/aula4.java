package aula;

import java.util.Scanner;

public class aula4 {

	public static void main(String[] args) {
		 Scanner gelo = new Scanner(System.in);

	        
	        double[] notas = new double[5];
	        double maiorNota = 0.0;
	        double menorNota = 100.0;

	       
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Informe a nota do aluno " + (i+1) + ": ");
	            notas[i] = gelo.nextDouble();

	          
	            if (notas[i] > maiorNota) {
	                maiorNota = notas[i];
	            }

	       
	            if (notas[i] < menorNota) {
	                menorNota = notas[i];
	            }
	        }

	        
	        System.out.println("Maior nota: " + maiorNota);
	        System.out.println("Menor nota: " + menorNota);

	        gelo.close();
	    }	
		

	

}
