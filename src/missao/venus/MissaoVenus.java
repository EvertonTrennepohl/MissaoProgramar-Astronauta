package missao.venus;

import java.util.Scanner;

/*
		Miss�o V�nus 
	Escreva um programa  que tenha dois n�meros como entrada e exiba o produto de dois n�meros. 
	Dados de teste:
	Insira o primeiro n�mero: 25
	Insira o segundo n�mero: 5
	Resultado esperado:
	25 x 5 = 125
	
	 */

public class MissaoVenus {

	public static void main(String[] args) {
		int primeiro = 0;
		int segundo = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira o primeiro n�mero: ");
		primeiro = scan.nextInt();
		System.out.println("Insira o segunddo n�mero: ");
		segundo = scan.nextInt();
		System.out.printf("\n%d x %d = %d", primeiro, segundo, (primeiro * segundo));
		scan.close();
	}

}
