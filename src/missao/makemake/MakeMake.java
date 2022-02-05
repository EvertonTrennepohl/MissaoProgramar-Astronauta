package missao.makemake;

import java.util.Scanner;

/*
	 * Miss�o MakeMake 
	Fa�a um programa para a leitura de duas notas parciais de um aluno. 
	Dica: #Estrutura de decis�o e #Estrutura de repeti��o 
	O programa deve calcular a m�dia alcan�ada por aluno e apresentar:
	A mensagem "Aprovado", se a m�dia alcan�ada for maior ou igual a sete;
	A mensagem "Reprovado", se a m�dia for menor do que sete;
	A mensagem "Aprovado com Distin��o", se a m�dia for igual a dez.

 */

public class MakeMake {

	public static void main(String[] args) {

		double nota1 = 0;
		double nota2 = 0;
		double media = 0;
		String msg = "Aprovado";
		int sair = 1;

		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("Informe a primeira nota: ");
			nota1 = scan.nextDouble();
			System.out.println("Informe a seguunda nota: ");
			nota2 = scan.nextDouble();

			media = (nota1 + nota2) / 2;
			if (media == 10) {
				msg = "Aprovado com distin��o!";
			} else if (media >= 7) {
				msg = "Aprovado!";
			} else {
				msg = "reprovado";
			}
			System.out.println(msg);
			do {
				System.out.println("\n5"
						+ "Digite '1' para continuar ou '0' para sair: ");
				sair = scan.nextInt();
			} while (sair != 1 && sair != 0);
		} while (sair == 1);
		scan.close();
	}

}
