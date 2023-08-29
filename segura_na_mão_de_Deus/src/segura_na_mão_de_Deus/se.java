package segura_na_mão_de_Deus;

import java.util.Scanner;

public class se {

	public static void main(String[] args) {
		Scanner gelo = new Scanner(System.in);
		float salariobase,salarioT ;
		System.out.println("digite seu salario: ");
		salariobase = gelo.nextFloat();
		salarioT = 50+salariobase-(0.10f*salariobase);
		
		System.out.println("salario atual e de: " +salarioT);

	}

}
