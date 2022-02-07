package missao.haumea;

import java.util.Scanner;

/*
	 * **Missão Haumea 
	Escreva um programa  para converter um número decimal em número octal.
	Dados de teste:
	Insira um número decimal: 15
	Resultado esperado:
	O número octal é: 17
 */

public class Haumea {

	public static void main(String[] args) {

		int numero = 0;
		Scanner scan = new Scanner(System.in);
		String resposta = "";
		int octal = 0;

		System.out.println("Informe o número que deve ser transformado em octal: ");
		numero = scan.nextInt();

		while (numero > 0) {
			octal = numero % 8;
			numero = numero / 8;
			resposta = octal + resposta;
		}
		
//		Passando decimal para octal utilizando o método da classe Integer
//		resposta = "O valor de " + numero + " em octal é: " + Integer.toOctalString(numero);
		
		System.out.println(resposta);
		scan.close();

	}

}
