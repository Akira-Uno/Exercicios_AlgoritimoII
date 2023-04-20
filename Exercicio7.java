package Exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um nome");
		String nome = scanner.next();
		nomeEmASCII(nome);
		
	}
	public static void nomeEmASCII(String nome) {
		byte []array = null;
		String valASCII = "";
		for(int i = 0; i < nome.length();i++) {
			valASCII+=nome.charAt(i);
			array = valASCII.getBytes();
		}
		System.out.println(Arrays.toString(array));
	}
}
