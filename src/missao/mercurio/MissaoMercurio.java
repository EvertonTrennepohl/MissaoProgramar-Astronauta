package missao.mercurio;

import java.util.Scanner;

public class MissaoMercurio {
	
	/*
		 * Miss�o Merc�rio
	As Organiza��es Tabajara resolveram dar um aumento de sal�rio aos seus colaboradores e lhe contrataram para desenvolver o programa que calcular� os reajustes. 
	Fa�a um programa que recebe o sal�rio de um colaborador e o reajuste segundo o seguinte crit�rio, baseado no sal�rio atual:
	sal�rios at� R$ 280,00 (incluindo) : aumento de 20%
	sal�rios entre R$ 280,00 e R$ 700,00 : aumento de 15%
	sal�rios entre R$ 700,00 e R$ 1500,00 : aumento de 10%
	sal�rios de R$ 1500,00 em diante : aumento de 5% Ap�s o aumento ser realizado, informe na tela:
	o sal�rio antes do reajuste;
	o percentual de aumento aplicado;
	o valor do aumento;
	o novo sal�rio, ap�s o aumento.

	 */	

	public static void main(String[] args) {
		double salario = 0;
		double novoSalario = 0;
		int percentual = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o sal�rio R$: ");
		salario = scan.nextDouble();
		if (salario <= 280) {
			novoSalario = salario + (salario * 0.20);
			percentual = 20;
		} else if (salario > 280 && salario <= 700) {
			novoSalario = salario + (salario * 0.15);
			percentual = 15;
		} else if (salario > 700 && salario <= 1500) {
			novoSalario = salario + (salario * 0.10);
			percentual = 10;
		} else if (salario > 1500) {
			novoSalario = salario + (salario * 0.05);
			percentual = 5;
		}
		scan.close();
		System.out.printf("Sal�rio: R$ %.2f" , salario);
		System.out.println("\nPercentual de aumento:" + percentual + "%");
		System.out.printf("Valor do aumento: R$ %.2f", (novoSalario - salario));
		System.out.printf("\nSal�rio ap�s aumento: R$ %.2f", novoSalario);

	}

}
