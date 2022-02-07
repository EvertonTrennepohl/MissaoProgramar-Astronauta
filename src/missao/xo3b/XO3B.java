package missao.xo3b;

import java.util.Scanner;

/*
	 * **Missão XO-3B 
	Faça um Programa que verifique se uma letra digitada é vogal ou consoante. 
	Dados de teste:
	Insira uma letra: A
	Resultado esperado:
	A letra é : Vogal
 */

public class XO3B {

	public static void main(String[] args) {
		
		char letra = '0';
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra: ");
		letra = scan.next().toLowerCase().charAt(0);
		System.out.println(testaLetra(letra));
		scan.close();
	}
	
	private static String testaLetra(char letra) {
		char[] vogais = {'a', 'e', 'i', 'o', 'u'};
		char[] consoantes = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
		char[] numeros = {'1','2','3','4','5','6','7','8','9','0'};
		String resposta = "";
		for (char v: vogais) {
			if (letra == v) {
				return "Vogal";
			}
		}
		for (char c: consoantes) {
			if (letra == c) {
				return "Consoante";
			}
		}
		for (char n: numeros) {
			if (letra == n) {
				return "Número";
			}
		}
		return resposta;
	}

}
