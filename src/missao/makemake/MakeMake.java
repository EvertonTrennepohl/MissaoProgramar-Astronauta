package missao.makemake;

import java.util.Scanner;

/*
	 * Missão MakeMake 
	Faça um programa para a leitura de duas notas parciais de um aluno. 
	Dica: #Estrutura de decisão e #Estrutura de repetição 
	O programa deve calcular a média alcançada por aluno e apresentar:
	A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
	A mensagem "Reprovado", se a média for menor do que sete;
	A mensagem "Aprovado com Distinção", se a média for igual a dez.

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
				msg = "Aprovado com distinção!";
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
