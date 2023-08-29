package gg_test;

import java.util.Scanner;

public class metodo {

	public static void main(String[] args) {
		float a, b, c, m;

		Scanner scn = new Scanner(System.in);

		System.out.println("digite o peso: kg ");

		a = scn.nextFloat();

		System.out.println("digite o altura: m");

		b = scn.nextFloat();

		m = a / (b * b);

		if (m < 20) {

			System.out.println("abaixo do peso.");
		} else if (m < 25) {
			System.out.println("poso normal");
		} else if (m < 30) {
			System.out.println("sobre peso.");
		} else if (m < 40) {
			System.out.println("obeso.");
		} else {
			System.out.println("obeso morbido.");

		}

	}

}
