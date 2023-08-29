package aula;

import java.util.Scanner;

public class par_impar {

	public static void main(String[] args) {
		try (Scanner gelo = new Scanner(System.in)) {
			float n1, n2;
			System.out.println("digite o numero: ");
			n1 = gelo.nextFloat();
			n2 = n1 % 2;
			if (n2 == 0) {
				System.out.println("o numero é par: " + n1);
			} else {
				System.out.println("o numero é impar: " + n1);
			}
		}

	}

}
