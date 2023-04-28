package Teste;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio18 {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		mediaNotas();
	}
	public static void mediaNotas() {
		int array[] = new int[5];
		int maior= 0;
		int menor = 0;
		int media = 0;
		int somaArray = 0;
		for(int i = 0; i < array.length;i++) {
			int min = array[i];
			int max = array[i];
			System.out.println("digite a nota " + (i+ 1));
			int num  = scanner.nextInt();
			array[i] = num;
			
			
			
		}
		for(int i = 0 ; i < array.length;i++) {
			Arrays.sort(array);
			if(array[i]>=maior) {
				maior = array[i];
			} if(array[i] <= array[0]) {
				menor = array[i];
			}
			somaArray+=array[i];
			media = somaArray / array.length;
		}
		System.out.println(Arrays.toString(array));
		System.out.println("Maior nota " + maior);
		System.out.println("Menor nota " + menor);
		System.out.println("A media dos numeros é: " + media);
		
	}
}
