package missao.escarlate;

import java.util.Scanner;

/*
	 * Missão Escarlate
	Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar,
	sabendo que a decisão é sempre pelo mais barato. 

 */

public class Escarlate {

	public static void main(String[] args) {
		
		double a = 0;
		double b = 0;
		double c = 0;
		double barato = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor do primeiro produto: ");
		a = scan.nextDouble();
		System.out.println("Informe o valor do seguundo produto: ");
		b = scan.nextDouble();
		System.out.println("Informe o valor do terceiro produto: ");
		c = scan.nextDouble();
		
		if (a < b && a < c) {
			barato = a;
		} else if (b < a && b < c) {
			barato = b;
		} else {
			barato = c;
		}
		scan.close();
		System.out.printf("\nO produto mais barato custa: R$ %.2f", barato);
	}

}
