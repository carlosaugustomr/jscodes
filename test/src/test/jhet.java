package test;

import java.util.Scanner;

public class jhet {
	public static void main(String[] args) {
		
		int ano ;       
        Scanner gelo =new Scanner(System.in);
	    
		System.out.println("digite o ano para saber se bissexto :");
		ano = gelo.nextInt();
	    //if, whiler, else, for :boolern 
		if(ano%400==0 || ano%4==0 && ano%100!=0) {
			System.out.println("Não bissexto!");
			
		}else {
			System.out.println("Bissexto");
		}
		
	}
}
