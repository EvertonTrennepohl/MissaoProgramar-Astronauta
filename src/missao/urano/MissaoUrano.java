package missao.urano;

import java.util.Scanner;

public class MissaoUrano {

	public static void main(String[] args) {
		int numero = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o valor que deseja exibir a tabuada: ");
		numero = scan.nextInt();
		imprimeTabuada(numero);
		scan.close();
	}
	
	private static void imprimeTabuada(int num) {
		for (int i = 0; i < 10; i++) {
			System.out.println(num + " X " + i + " = " + (i * num));
		}
	}

}
