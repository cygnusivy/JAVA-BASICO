package br.com.alura.var;

public class VarChar {

	public static void main(String[] args) {

		// char guarda um único caractere, uma única letra 
		// é uma variável do tipo numerico, no fundo ele é um numero que é convertido para letra
		char letra = 'a';
		System.out.println(letra);
		char  valor = 66;
		valor = (char) (valor -1); // cast
		System.out.println(valor);
	}

}
