package missao.saturno;

/*
	Miss�o Saturno 
	Escreva um programa  para imprimir os n�meros �mpares de 1 a 99. Imprime um n�mero por linha.  
	Dica: #Estrutura de repeti��o e  #Estrutura de decis�o
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
