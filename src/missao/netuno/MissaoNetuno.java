package missao.netuno;

import java.util.Scanner;

/*
	Missão Netuno 
	Escreva um programa  para aceitar um número e verifique se o número é par ou não. Imprime 1 se o número for par ou 0 se o número for ímpar. 
	Dica: #Estrutura de decisão
	Dados de teste:
	Insira um número: 20
	Resultado esperado:
	Saída de amostra: 1

 */

public class MissaoNetuno {

	public static void main(String[] args) {
		int num = 0;
		int teste = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira um número: ");
		num = scan.nextInt();
		if (num % 2 == 0) {
			teste = 1;
		}
		System.out.println(teste);
		scan.close();
		
	}

}
