package missao.netuno;

import java.util.Scanner;

/*
	Miss�o Netuno 
	Escreva um programa  para aceitar um n�mero e verifique se o n�mero � par ou n�o. Imprime 1 se o n�mero for par ou 0 se o n�mero for �mpar. 
	Dica: #Estrutura de decis�o
	Dados de teste:
	Insira um n�mero: 20
	Resultado esperado:
	Sa�da de amostra: 1

 */

public class MissaoNetuno {

	public static void main(String[] args) {
		int num = 0;
		int teste = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira um n�mero: ");
		num = scan.nextInt();
		if (num % 2 == 0) {
			teste = 1;
		}
		System.out.println(teste);
		scan.close();
		
	}

}
