package missao.xo5;

import java.util.Scanner;

/*
	**Missão XO-5
	Escreva um programa para reverter uma string. (Opcional : faça se vc souber usar array(“vetor”))
	Dados de teste:
	The quick brown fox
	Resultado esperado:
	String reversa: xof nworb kciuq ehT
*/

public class XO5 {

	public static void main(String[] args) {
		String frase = "";
		String inversa = "";
		Scanner scan= new Scanner(System.in);
		System.out.println("Digite uma frase: ");
		frase = scan.nextLine();
		for (int i = frase.length() - 1; i >= 0; i--) {
			inversa += frase.charAt(i);
		}
		System.out.println(inversa);
	}

}
