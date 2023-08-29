package msm;

import java.util.Scanner;

public class bom_II {

	

	public static void main(String[] args) {

		
			        Scanner gelo = new Scanner(System.in) {
					float boleto1,boleto2, boleto3, boleto4, totalContas,diferenca,salarioLiquido,percentual;

					System.out.println("Digite o valor dos 4 boletos que você deve pagar:");
					System.out.print("Boleto 1: R$");
					boleto1 = gelo.nextFloat();
					System.out.print("Boleto 2: R$");
					boleto2 = gelo.nextFloat();
					System.out.print("Boleto 3: R$");
					boleto3 = gelo.nextFloat();
					System.out.print("Boleto 4: R$");
					boleto4 = gelo.nextFloat();

					
					System.out.print("Digite o valor do seu salário líquido: R$");
					salarioLiquido = gelo.nextFloat();

					
					totalContas = boleto1 + boleto2 + boleto3 + boleto4;
				
				percentual=(0.14f*salarioLiquido);
				
				diferenca = salarioLiquido - totalContas-percentual;

				
				System.out.printf("O total de suas contas é R$%.2f.\n", totalContas);
				System.out.printf("O valor que irá sobrar (ou faltar) é R$%.2f.\n", diferenca);
				
				
				
			    }

	}
}

