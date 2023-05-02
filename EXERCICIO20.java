package EXERCICIOS;

import java.util.Arrays;
import java.util.Random;

public class EXERCICIO20 {
	public static void main(String[] args) {
		maiorQue(30);
		
	}
	public static void maiorQue(int num) {
		int vetor[] = new int [10];
		int novoArray[] = new int[10];
		Random r= new Random();
		for(int i = 0; i < vetor.length;i++) {
			vetor[i] = r.nextInt(99);
		}

		
		System.out.println(Arrays.toString(vetor));

		for(int i = 0; i <vetor.length;i++ ) {
			
			if(vetor[i] > num) {
				novoArray[i] = vetor[i];
			}
			
		}
		vetor = novoArray;
		for(int i : vetor) {
			if(i != 0) {
				System.out.print(i + " ");
				
			}
		}
		
		
		
	}
	
	
	
}
