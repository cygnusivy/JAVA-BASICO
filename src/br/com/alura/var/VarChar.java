package br.com.alura.var;

public class VarChar {

	public static void main(String[] args) {

		// char guarda um �nico caractere, uma �nica letra 
		// � uma vari�vel do tipo numerico, no fundo ele � um numero que � convertido para letra
		char letra = 'a';
		System.out.println(letra);
		char  valor = 66;
		valor = (char) (valor -1); // cast
		System.out.println(valor);
	}

}
