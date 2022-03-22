package br.com.alura.var;

public class VarInt {

	public static void main(String[] args) {

		System.out.println("Novo teste");
		
		// declara vari�vel
		// java � uma linguagem fotemente tipada
		// int -> vari�vel utilizada para trabalhar com n�meros inteiros
		
		int idade = 20;
		System.out.println("A idade �" + idade);

		idade = 20 + 30;
		System.out.printf("A idade � %d", idade);		
		System.out.printf("\n");
		
		// ao dividir dois numeros inteiros, o resultado nem sempre � um numero inteiro
		// neste sentido, quando o resultado da divids�o � um n�mero real, os valores ap�s
		// o ponto flutuante n�o s�o mostrados no resultado, � exibido apenas  o valor inteiro 
		// que representa o n�mero, por exemplo: se o resultado da divis�o de dois inteiros � 
		// 2.5, o resultado exibido no console ser� dois. 
		// esta regra aplica-se tamb�m a divis�o de n�meros com ponto flutuante.
		//Ou seja, o numero deve ser representado na opera��o conforme seu tipo.
		int brindes = 15;
		int pessoas = 2;
		System.out.println(brindes/pessoas); 
	}
}