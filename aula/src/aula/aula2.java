package aula;

import java.util.Scanner;

public class aula2 {
	public static void main(String[] args) {
		Sazom festa= new Sazom();
        Scanner gelo = new Scanner(System.in);
        int qtd_homem_peso = 0;
        int qtd_mulher_peso = 0;
        festa.sal();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Digite o sexo da %dª pessoa (H/M): ", i);
            String sx = gelo.next();
            System.out.printf("Digite o peso da %dª pessoa em kg: ", i);
            double peso = gelo.nextDouble();

            if (sx.equalsIgnoreCase("H") && peso >= 60 && peso <= 80) {
                qtd_homem_peso++;
            } else if (sx.equalsIgnoreCase("M") && peso >= 50 && peso <= 70) {
                qtd_mulher_peso++;
            }
        }

        System.out.printf("%d homens possuem peso entre 60 e 80 kg.\n", qtd_homem_peso);
        System.out.printf("%d mulheres possuem peso entre 50 e 70 kg.\n", qtd_mulher_peso);

        gelo.close();
    }

}
