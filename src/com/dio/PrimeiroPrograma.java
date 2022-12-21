package com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
	public static void main(String[] args) {
		
		
		
		
		Gato gato = new Gato();
		Livros livros = new Livros();
		
		System.out.println(gato);
		System.out.println(livros);
		
		
		/*int a = 956;
		int b = 1000;
		
		System.out.println("Oi Mundo " + (a+b) + " vezes");*/
	}

}

class Livros{
	
	private String nome;
	private String npag;
}


