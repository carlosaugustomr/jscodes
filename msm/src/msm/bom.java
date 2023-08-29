package msm;

import java.util.Scanner;

class bom {

	
	public static void main(String[] args) {
		try (Scanner gelo = new Scanner(System.in)) {
			System.out.println("Digite o valor dos 4 boletos que você deve pagar:");
			System.out.print("Boleto 1: R$");
			double boleto1 = gelo.nextDouble();
			System.out.print("Boleto 2: R$");
			double boleto2 = gelo.nextDouble();
			System.out.print("Boleto 3: R$");
			double boleto3 = gelo.nextDouble();
			System.out.print("Boleto 4: R$");
			double boleto4 = gelo.nextDouble();

			
			System.out.print("Digite o valor do seu salário líquido: R$");
			double salarioLiquido = gelo.nextDouble();

			
			double totalContas = boleto1 + boleto2 + boleto3 + boleto4;

			
			double diferenca = salarioLiquido - totalContas;

			
			System.out.printf("O total de suas contas é R$%.2f.\n", totalContas);
			System.out.printf("O valor que irá sobrar (ou faltar) é R$%.2f.\n", diferenca);
		}
    

	}

}
