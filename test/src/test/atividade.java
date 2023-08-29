package test;

import java.util.Scanner;

public class atividade {
	public static void main(String[] args) {
		Scanner gelo= new Scanner (System.in);
		float a,b;
		System.out.println("digite um numero :");
		a=gelo.nextFloat();
		
		for (b=1;b<=a;b+=1) {
		
			System.out.println(b);
		}
gelo.close();
	}

	
		
	

}
