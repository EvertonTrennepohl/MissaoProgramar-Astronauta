package missao.haumea;

import java.util.Scanner;

/*
	 * **Miss�o Haumea 
	Escreva um programa  para converter um n�mero decimal em n�mero octal.
	Dados de teste:
	Insira um n�mero decimal: 15
	Resultado esperado:
	O n�mero octal �: 17
 */

public class Haumea {

	public static void main(String[] args) {

		int numero = 0;
		Scanner scan = new Scanner(System.in);
		String resposta = "";
		int octal = 0;

		System.out.println("Informe o n�mero que deve ser transformado em octal: ");
		numero = scan.nextInt();

		while (numero > 0) {
			octal = numero % 8;
			numero = numero / 8;
			resposta = octal + resposta;
		}
		
//		Passando decimal para octal utilizando o m�todo da classe Integer
//		resposta = "O valor de " + numero + " em octal �: " + Integer.toOctalString(numero);
		
		System.out.println(resposta);
		scan.close();

	}

}
