package test;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		int x,y,z,s,f;
		Scanner gelo = new Scanner(System.in);
		s=0;
		f=0;
		while (f<3) {
			System.out.println("digite um numero :");
			x=gelo.nextInt();
			s=s+x;
			f=f+1;
		}
		System.out.println(s);			
			
		
	System.out.println("...");

	}

}
