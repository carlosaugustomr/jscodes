package coin;

import java.util.Scanner;

public class Principa{ 
	public static void main(String[] args) {
		int y ,x ,z,v,d ;
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("digite:"); 
		y=teclado.nextInt();
		System.out.println("digite outro");
		x=teclado.nextInt();
		z =y+x;
		v =y*x;
		d =y/x;
		System.out.println("soma deu"+z);
		System.out.println("m"+v);
		System.out.println("div"+d);
		// TODO Auto-generated method stub
	}

}
