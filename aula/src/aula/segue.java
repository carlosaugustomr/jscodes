package aula;

import java.util.Scanner;

public class segue {

	public static void main(String[] args) {
        Scanner gelo = new Scanner(System.in);
        double somaT = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Digite a temperatura do dia %d de janeiro: ", i);
            double temp = gelo.nextDouble();
            somaT += temp;
        }

        double m = somaT / 10;

        System.out.printf("A média das temperaturas dos 10 primeiros dias de janeiro de 2021 em Belo Horizonte foi de %.2f graus Celsius.\n", m);
        gelo.close();
    }


}
