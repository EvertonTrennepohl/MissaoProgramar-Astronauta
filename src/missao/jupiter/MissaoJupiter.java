package missao.jupiter;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
	Missão Júpiter 
	Escreva um programa para converter segundos em horas, minutos e segundos. 
	Dados de teste:
	Segundos de entrada: 86399 
	Resultado esperado:
	Saída de amostra: 23:59:59
 */

public class MissaoJupiter {
	
	public static void main(String[] args) {
		long hora = 0;
		long minuto = 0;
		long segundo = 0;
		long valor = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a quantidade de segundos: ");
		valor = scan.nextLong();
		hora = (valor / 60) / 60;
		minuto = (valor / 60) % 60;
		segundo = valor - (hora * 3600 + minuto * 60);
		DecimalFormat format = new DecimalFormat("00");
		
		System.out.printf("%s:%s:%s", format.format(hora), format.format(minuto), format.format(segundo));
		scan.close();
	}

}
