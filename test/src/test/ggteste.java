package test;

import java.util.Scanner;

public class ggteste {

	public static void main(String[] args) {
		double n1;
		try (Scanner gelo = new Scanner(System.in)) {
			
			System.out.println("digite um numero :");
			n1=gelo.nextDouble();
			
			if(n1>=10&&n1<=20) {
				System.out.println("entre 10 e 20");
			}else {
				System.out.println("não esta dentro do 10 a 20");
			}
			
		}
		
		
	}

}
