package test;

import java.util.Scanner;

public class Game {
	


	public static void main(String[] args) {
		
		float a,b,c,media;
		
		Scanner gelo = new Scanner (System.in);
		 b=0;
		 c=0;
		
		 for (int i=1 ; i<=3 ;i++ ) {
			System.out.println("digite sua nota :");
			a=gelo.nextFloat();
		    c=c+a;
			b++;
		}
		
		media=c/b;
		
		System.out.println("Media ="+media);
		
		if(media>=70) {
		    System.out.println("aprovado");	
		}
		else if (media>60 && media<70){
			System.out.println("reprovado");
			
		}
		else {
			System.out.println("reprovado");
		}
		
		
		
	}

}
