package Teste;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o começo");
		int inicio = scanner.nextInt();
		System.out.println("Digite o final");
		int fim = scanner.nextInt();
		criarVetor(inicio, fim);
		
	}
	public static void criarVetor(int inicio, int fim) {
		
		int array[] = new int[fim - inicio + 1];
		int cont = inicio;
		for(int i = 0; i < array.length;i++) {
			array[i] = cont++;
		}
		System.out.println(Arrays.toString(array));
	}
}
