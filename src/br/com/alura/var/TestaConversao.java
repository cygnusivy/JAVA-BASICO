package br.com.alura.var;

public class TestaConversao {

	public static void main(String[] args) {

		// int cabe em 32 bits 
		// long - guarda números muito grandes, é preciso passar um l no final do número
		//shot - guarda número de até 16 bits
		// byte - muito pequeno até 127
		// BigDecimal - para mecher com dinheiro
		//float - 
		double salario = 1520.50;
		int valor = (int)salario; // esse método realiza um casting, ele tranforma um double em um inteiro nesta situação
		System.out.println(valor); // porém ele só imprime a porção inteira do número 
	}

}
