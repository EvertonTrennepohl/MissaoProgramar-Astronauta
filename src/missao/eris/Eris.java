package missao.eris;

import java.util.Scanner;

/*
	 * **Miss�o �ris 
	Fa�a um programa que fa�a 5 perguntas para uma pessoa sobre um crime. As perguntas s�o:
	 Dica: #Estrutura de decis�o  
	"Telefonou para a v�tima?"
	"Esteve no local do crime?"
	"Mora perto da v�tima?"
	"Devia para a v�tima?"
	"J� trabalhou com a v�tima?" O programa deve no final emitir uma classifica��o sobre a participa��o da pessoa no crime. 
	Se a pessoa responder positivamente a 2 quest�es ela deve ser classificada como "Suspeita", entre 3 e 4 como "C�mplice" 
	e 5 como "Assassino". Caso contr�rio, ele ser� classificado como "Inocente".

 */

public class Eris {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int count = 0;
		char c = '0';
		String resposta = "Inocente";
		String pergunta = "Telefonou para a v�tima?\n\t S-Sim  N-N�o";

		System.out.println("Responda as seguintes perguntas:");
		do {
			System.out.println(pergunta);
			c = scan.next().toUpperCase().charAt(0);
			if (c == 'S') {
				count++;
			}
		} while (c != 'S' && c != 'N');

		pergunta = "Esteve no local do crime?\n\t S-Sim  N-N�o";
		do {
			System.out.println(pergunta);
			c = scan.next().toUpperCase().charAt(0);
			if (c == 'S') {
				count++;
			}
		} while (c != 'S' && c != 'N');

		pergunta = "Mora perto da v�tima?\n\t S-Sim  N-N�o";
		do {
			System.out.println(pergunta);
			c = scan.next().toUpperCase().charAt(0);
			if (c == 'S') {
				count++;
			}
		} while (c != 'S' && c != 'N');

		pergunta = "Devia para a v�tima?\n\t S-Sim  N-N�o";
		do {
			System.out.println(pergunta);
			c = scan.next().toUpperCase().charAt(0);
			if (c == 'S') {
				count++;
			}
		} while (c != 'S' && c != 'N');

		pergunta = "J� trabalhou para a v�tima?\n\t S-Sim  N-N�o";
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
			resposta = "C�mplice";
			break;
		case 5:
			resposta = "Assassino";
			break;
		}
		scan.close();
		System.out.println(resposta);
	}

}
