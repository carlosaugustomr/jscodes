package fdd;
import java.util.Scanner;

public class zezim {

	public static void main(String[] args) {
		Scanner gelo=new Scanner(System.in);
		float sla,sla2 ;
	    System.out.println("digite um valor : ");
		sla=gelo.nextFloat();
		if(sla>0) {
			
			System.out.println("O numero é maior que 0: ");
		} else {
			System.out.println("O numero é menor que 0: ");
		}
		

	}

}
