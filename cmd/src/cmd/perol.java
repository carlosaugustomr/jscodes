package cmd;

import java.util.Scanner;

public class perol {

	public static void main(String[] args) {
		float salario,salarioaumentado,aumento;
		
		try (Scanner gelo = new Scanner(System.in)) {
			System.out.println("digite o salario:");
			salario = gelo.nextFloat();
			System.out.println("digite o persetual de aumento");
			salarioaumentado=gelo.nextFloat();
		
		
		aumento=salario+(salarioaumentado/100*salario);
		System.out.println("O salario foi para:  R$"+ aumento);
		
        }
	} 

}
