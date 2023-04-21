package Exercicios;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Digite a frase");
		String frase = scanner.nextLine();
		mimimi(frase);
	}
	public static void mimimi(String frase) {
		String novaFrase= "";
		for(int i = 0; i < frase.length();i++) {
			novaFrase += frase.charAt(i);
			if(novaFrase.contains("a") || novaFrase.contains("e") || novaFrase.contains("o") || novaFrase.contains("u")) {
			novaFrase = novaFrase.replace(novaFrase.charAt(i), 'i');
		
		}
		
	}
		System.out.println(novaFrase);
}
}
	
