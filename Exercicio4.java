package Exercicios;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o nome");
		String palavra = scanner.next();
		System.out.println("Digite a letra q deseja encontrar");
		char letra = scanner.next().charAt(0);
		acharLetra(palavra,letra);
		
		
	}
	
	public static void acharLetra (String palavra, char letra) {
		int contador= 0;
		for(int i = 0;i < palavra.length();i++) {
			if(palavra.charAt(i) == letra) {
				contador++;
			}
		}
		System.out.println("Existem: "+contador + "" + letra);
	}
}
