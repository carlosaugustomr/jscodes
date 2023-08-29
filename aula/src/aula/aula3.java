package aula;

import java.util.Scanner;

public class aula3 {
	public static void main(String[] args) {
        Scanner gelo = new Scanner(System.in);
        int qtd_mais_90kg = 0;
        int soma_idades = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.printf("Digite a idade da %dª pessoa: ", i);
            int idade = gelo.nextInt();
            System.out.printf("Digite o peso da %dª pessoa em kg: ", i);
            double peso = gelo.nextDouble();

            if (peso > 90) {
                qtd_mais_90kg++;
            }

            soma_idades += idade;
        }

        double media_idades = (double) soma_idades / 7;

        System.out.printf("%d pessoas possuem mais de 90 kg.\n", qtd_mais_90kg);
        System.out.printf("A média das idades das sete pessoas é %.2f anos.\n", media_idades);

        gelo.close();
    }

}
