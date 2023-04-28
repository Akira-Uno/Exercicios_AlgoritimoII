package Teste;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio19 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o numero");
		int num = scanner.nextInt();
		tabuada(num);
				
	}
	public static void tabuada(int num) {
		int tabuada []=new int[11];
		for(int i = 1; i < tabuada.length;i++) {
			tabuada[i] = num*i;
		}
		System.out.println(Arrays.toString(tabuada));
	}
}
