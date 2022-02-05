package missao.venus;

import java.util.Scanner;

/*
		Missão Vênus 
	Escreva um programa  que tenha dois números como entrada e exiba o produto de dois números. 
	Dados de teste:
	Insira o primeiro número: 25
	Insira o segundo número: 5
	Resultado esperado:
	25 x 5 = 125
	
	 */

public class MissaoVenus {

	public static void main(String[] args) {
		int primeiro = 0;
		int segundo = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira o primeiro número: ");
		primeiro = scan.nextInt();
		System.out.println("Insira o segunddo número: ");
		segundo = scan.nextInt();
		System.out.printf("\n%d x %d = %d", primeiro, segundo, (primeiro * segundo));
		scan.close();
	}

}
