package gg;
import java.util.Scanner;
public class kl {
	    public static void main(String[] args) {
	        Scanner gelo = new Scanner(System.in);
	        String i = "s"; 

	        while (i.equals("s")) { 
	            double salarioAtual, novoSalario;
	            System.out.print("Digite o salário atual do funcionário: ");
	            salarioAtual = gelo.nextDouble();
	            novoSalario = salarioAtual * 1.25;

	            System.out.printf("O novo salário do funcionário é: R$ %.2f\n", novoSalario);

	            System.out.println("Deseja continuar? Digite s para sim ou n para não: ");
	            i = gelo.next();
	            while (!i.equals("s") && !i.equals("n")) { 
	                System.out.println("Opção inválida. Digite s para sim ou n para não: ");
	                i = gelo.next();
	            }
	        }

	        gelo.close(); 
	    }
	}

