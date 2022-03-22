package br.com.alura.var;

public class VarDouble {

	public static void main(String[] args) {

		double salario = 1100.0;
		System.out.printf("O salário é : %f", salario);
		System.out.printf("\nO salário é : %.2f", salario);
		System.out.printf("\nO salário é : %.3f", salario);
		System.out.println("\nO salário é: " + salario);	
		
		double dividindoInteiros = 5/2; // esse código compila, mas não é a forma correta de declarar os valores
		System.out.println(dividindoInteiros);
	
		dividindoInteiros = 5.0/2.0; // essa é a forma correta de representar os valores do tipo inteiro
		System.out.println(dividindoInteiros);
		
		
	}

}
