package Exercicios;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a frase");
		String nome = scanner.nextLine();
		zenitPolar(nome);
		
	}

	public static void zenitPolar(String nome) {
		String frase = "";
		String testeFrase = "";
		for(int i = 0; i < nome.length();i++) {
			frase += nome.charAt(i);
		if(frase.charAt(i) == 'z') {
			frase = frase.replace(frase.charAt(i), 'p');
		}else if(frase.charAt(i) == 'p') {
			frase = frase.replace(frase.charAt(i), 'z');
		}else if(frase.charAt(i) == 'e') {
			frase = frase.replace(frase.charAt(i), 'o');
		}else if(frase.charAt(i) == 'o') {
			frase = frase.replace(frase.charAt(i), 'e');
		}else if(frase.charAt(i) == 'n') {
			frase = frase.replace(frase.charAt(i), 'l');
		}else if(frase.charAt(i) == 'l') {
			frase = frase.replace(frase.charAt(i), 'n');
		}else if(frase.charAt(i) == 'i') {
			frase = frase.replace(frase.charAt(i), 'a');
		}else if(frase.charAt(i) == 'a') {
			frase = frase.replace(frase.charAt(i), 'i');
		}else if(frase.charAt(i) == 't') {
			frase = frase.replace(frase.charAt(i), 'r');
		}else if(frase.charAt(i) == 'r') {
			frase = frase.replace(frase.charAt(i), 't');
		}
			
		}
			System.out.println(frase);
	}

}