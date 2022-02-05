package missao.saturno;

/*
	Missão Saturno 
	Escreva um programa  para imprimir os números ímpares de 1 a 99. Imprime um número por linha.  
	Dica: #Estrutura de repetição e  #Estrutura de decisão
	Resultado esperado:
	1
	3
	5
	7
	9
	11
	....
	                                                                    
	91
	93

 */

public class MissaoSaturno {

	public static void main(String[] args) {
		int count = 1;
		do {
			if (count % 2 != 0) {
				System.out.println(count);
			}
			count++;
		} while(count < 100);

	}

}
