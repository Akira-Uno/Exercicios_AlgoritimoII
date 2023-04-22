package Exercicios;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a frase");
		String frase = scanner.nextLine();
		System.out.println("Digite a posicao inicial");
		int posicao = scanner.nextInt();
		System.out.println("Digite o recorte ");
		int recorte = scanner.nextInt();
		subString(frase, posicao, recorte);

	}

	public static void subString(String nome, int poisicao, int recorte) {
		String frase = "";
		for (int i = poisicao; i < recorte; i++) {
			frase += nome.charAt(i);

		}
		if (poisicao > recorte) {
			for (int i = nome.length() - 1; i > poisicao; i--) {
//				frase += nome.charAt(i);
				for( int j = poisicao;j < nome.length();j++) {
					
					frase += nome.charAt(j);
					
				}
				break;
			}
		}
		
		System.out.println(frase);
	}

}
