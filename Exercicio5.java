package Exercicios;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o nome");
		String nome = scanner.next();
		invertePalavra(nome);
	}
	public static void invertePalavra(String nome) {
		String textoInvertido ="";
		for(int i = nome.length() - 1; i >= 0;i--) {
			textoInvertido += nome.charAt(i);
		}
		System.out.println(textoInvertido);
	}

}
