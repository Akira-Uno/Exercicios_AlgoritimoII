package EXERCICIOS;

import java.util.Arrays;
import java.util.Random;

public class Exercicio21 {
	public static void main(String[] args) {
		addNumero(34);
		
	}
	public static void addNumero(int num) {
		int vetor [] = new int[10];
		int novoVetor [] = new int[11]; 
		Random r = new Random();
		for(int i =0; i < vetor.length;i++) {
			vetor[i] = r.nextInt(99);
		}
		System.out.println(Arrays.toString(vetor));
		for(int i = 0; i < vetor.length;i++) {
			novoVetor[i] = vetor[i];
			if(vetor.length <novoVetor.length) {
				novoVetor[10] = num;
			}
		}
		
		vetor =novoVetor;
		
		System.out.println(Arrays.toString(vetor));
		
	}
	
	
}
