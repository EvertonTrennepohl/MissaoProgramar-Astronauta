package missao.mercurio;

import java.util.Scanner;

public class MissaoMercurio {
	
	/*
		 * Missão Mercúrio
	As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contrataram para desenvolver o programa que calculará os reajustes. 
	Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
	salários até R$ 280,00 (incluindo) : aumento de 20%
	salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
	salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
	salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela:
	o salário antes do reajuste;
	o percentual de aumento aplicado;
	o valor do aumento;
	o novo salário, após o aumento.

	 */	

	public static void main(String[] args) {
		double salario = 0;
		double novoSalario = 0;
		int percentual = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o salário R$: ");
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
		System.out.printf("Salário: R$ %.2f" , salario);
		System.out.println("\nPercentual de aumento:" + percentual + "%");
		System.out.printf("Valor do aumento: R$ %.2f", (novoSalario - salario));
		System.out.printf("\nSalário após aumento: R$ %.2f", novoSalario);

	}

}
