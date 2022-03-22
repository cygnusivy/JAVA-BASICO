package br.com.alura.var;

public class VarInt {

	public static void main(String[] args) {

		System.out.println("Novo teste");
		
		// declara variável
		// java é uma linguagem fotemente tipada
		// int -> variável utilizada para trabalhar com números inteiros
		
		int idade = 20;
		System.out.println("A idade é" + idade);

		idade = 20 + 30;
		System.out.printf("A idade é %d", idade);		
		System.out.printf("\n");
		
		// ao dividir dois numeros inteiros, o resultado nem sempre é um numero inteiro
		// neste sentido, quando o resultado da dividsão é um número real, os valores após
		// o ponto flutuante não são mostrados no resultado, é exibido apenas  o valor inteiro 
		// que representa o número, por exemplo: se o resultado da divisão de dois inteiros é 
		// 2.5, o resultado exibido no console será dois. 
		// esta regra aplica-se também a divisão de números com ponto flutuante.
		//Ou seja, o numero deve ser representado na operação conforme seu tipo.
		int brindes = 15;
		int pessoas = 2;
		System.out.println(brindes/pessoas); 
	}
}