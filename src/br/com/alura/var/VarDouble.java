package br.com.alura.var;

public class VarDouble {

	public static void main(String[] args) {

		double salario = 1100.0;
		System.out.printf("O sal�rio � : %f", salario);
		System.out.printf("\nO sal�rio � : %.2f", salario);
		System.out.printf("\nO sal�rio � : %.3f", salario);
		System.out.println("\nO sal�rio �: " + salario);	
		
		double dividindoInteiros = 5/2; // esse c�digo compila, mas n�o � a forma correta de declarar os valores
		System.out.println(dividindoInteiros);
	
		dividindoInteiros = 5.0/2.0; // essa � a forma correta de representar os valores do tipo inteiro
		System.out.println(dividindoInteiros);
		
		
	}

}
