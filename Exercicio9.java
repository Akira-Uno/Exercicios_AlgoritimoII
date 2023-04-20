package Exercicios;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner  scanner = new Scanner(System.in);
		System.out.println("digite a posição de fibonacci que deseja ver");
		int fibo = scanner.nextInt();
		fiboPosicao(fibo);
	}
	public static void fiboPosicao(int posicao) {
		int inicial =0;
		int final_ = 1;
		int soma;
		for( int i = 1 ; i <=20;i++) {
			soma = inicial +  final_;
			final_ = inicial;
			inicial = soma;
			if(posicao == i) {
				System.out.println("O numero de Fibonacci na posição " + posicao  + " é: " + soma);
				break;
			}
			
		}
	}

}
