package Exercicios;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um nome");
		String nome = scanner.next();
		palidromo(nome);
		
	}
	public static void palidromo(String nome) {
		String pali = "";
		for(int i = nome.length() - 1; i >=0;i--) {
			pali += nome.charAt(i);
			
			
		}
		if(nome.equalsIgnoreCase(pali)) {
			System.out.println("Palidromo");
		}else {
			System.out.println("Não é um palidromo");
		}
		
	}

}
