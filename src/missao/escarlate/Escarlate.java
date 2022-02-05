package missao.escarlate;

import java.util.Scanner;

/*
	 * Miss�o Escarlate
	Fa�a um programa que pergunte o pre�o de tr�s produtos e informe qual produto voc� deve comprar,
	sabendo que a decis�o � sempre pelo mais barato. 

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
