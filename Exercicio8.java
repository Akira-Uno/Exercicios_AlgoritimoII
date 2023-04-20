package Exercicios;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite sua senha");
		String senha = scanner.next();
		senhaForte(senha);
		
	}
	public static void senhaForte(String senha) {
		String senhaArmazenada = " ";
		int contCaractere =0;
		int contNumeros =0;
		for(int i = 0; i < senha.length();i++) {
			char validaSennha = senha.charAt(i); 
			if(Character.isDigit(validaSennha)) {
				contNumeros++;
			}
			if(!Character.isLetter(validaSennha)) {
				contCaractere++;
			}
		senhaArmazenada += validaSennha;
		
		}
		if( senhaArmazenada.length() >= 8 && contCaractere >= 2 && contNumeros >= 2) {
			System.out.println("Senha forte");
		}else {
			System.out.println("Senha fraca");
		}
		
		
	}
}
