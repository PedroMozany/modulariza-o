package application;

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N;

		System.out.print("Digite a quantidade de nadador que sera analisado: ");
		N = sc.nextInt();

// LAÇO FOR QUE VAI REPETIR O PROCETIMENTO N NUMERO 
		for (int i = 0; i <= N; i++) {
			// CHAMENTO O PROCEMTO IDADE
			idade(N);
		}

		sc.close();
	}

	// PROCEMNTO IDADE COM PARAMENTRO QUE VAI RETURNA N
	public static double idade(int N) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a idade do nadador: ");
		N = sc.nextInt();
// CONDICIONAMENTO PARA TESTA QUAL CATERIGORIA QUE VAI SE ENQUADRAR O VALOR INTEIRO QUE REPRESENTA A IDADE QUE VAI SER DIGITADO NO CONSOLE. 
		if ((N >= 5) && (N <= 7)) {
			System.out.println("Categoria = E");
		} else if ((N >= 8) && (N <= 10)) {
			System.out.println("Categoria = F");
		} else if ((N >= 11) && (N <= 13)) {
			System.out.println("Categoria = D");
		} else if ((N >= 14) && (N <= 15)) {
			System.out.println("Categoria = C");
		} else if ((N >= 16) && (N <= 17)) {
			System.out.println("Categoria = B");
		} else if (N >= 18) {
			System.out.println("Categoria = A");
		}

		return N;
	}

}
