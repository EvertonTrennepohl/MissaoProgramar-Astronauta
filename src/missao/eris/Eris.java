package missao.eris;

import java.util.Scanner;

/*
	 * **Missão Éris 
	Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
	 Dica: #Estrutura de decisão  
	"Telefonou para a vítima?"
	"Esteve no local do crime?"
	"Mora perto da vítima?"
	"Devia para a vítima?"
	"Já trabalhou com a vítima?" O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. 
	Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" 
	e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".

 */

public class Eris {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int count = 0;
		char c = '0';
		String resposta = "Inocente";
		String pergunta = "Telefonou para a vítima?\n\t S-Sim  N-Não";

		System.out.println("Responda as seguintes perguntas:");
		do {
			System.out.println(pergunta);
			c = scan.next().toUpperCase().charAt(0);
			if (c == 'S') {
				count++;
			}
		} while (c != 'S' && c != 'N');

		pergunta = "Esteve no local do crime?\n\t S-Sim  N-Não";
		do {
			System.out.println(pergunta);
			c = scan.next().toUpperCase().charAt(0);
			if (c == 'S') {
				count++;
			}
		} while (c != 'S' && c != 'N');

		pergunta = "Mora perto da vítima?\n\t S-Sim  N-Não";
		do {
			System.out.println(pergunta);
			c = scan.next().toUpperCase().charAt(0);
			if (c == 'S') {
				count++;
			}
		} while (c != 'S' && c != 'N');

		pergunta = "Devia para a vítima?\n\t S-Sim  N-Não";
		do {
			System.out.println(pergunta);
			c = scan.next().toUpperCase().charAt(0);
			if (c == 'S') {
				count++;
			}
		} while (c != 'S' && c != 'N');

		pergunta = "Já trabalhou para a vítima?\n\t S-Sim  N-Não";
		do {
			System.out.println(pergunta);
			c = scan.next().toUpperCase().charAt(0);
			if (c == 'S') {
				count++;
			}
		} while (c != 'S' && c != 'N');

		switch (count) {
		case 2:
			resposta = "Suspeita";
			break;
		case 3:
		case 4:
			resposta = "Cúmplice";
			break;
		case 5:
			resposta = "Assassino";
			break;
		}
		scan.close();
		System.out.println(resposta);
	}

}
