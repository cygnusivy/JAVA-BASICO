package br.com.alura.var;

public class TestaConversao {

	public static void main(String[] args) {

		// int cabe em 32 bits 
		// long - guarda n�meros muito grandes, � preciso passar um l no final do n�mero
		//shot - guarda n�mero de at� 16 bits
		// byte - muito pequeno at� 127
		// BigDecimal - para mecher com dinheiro
		//float - 
		double salario = 1520.50;
		int valor = (int)salario; // esse m�todo realiza um casting, ele tranforma um double em um inteiro nesta situa��o
		System.out.println(valor); // por�m ele s� imprime a por��o inteira do n�mero 
	}

}
