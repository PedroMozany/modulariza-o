package application;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N;

		System.out.print("Digite o valor de N: ");
		N = sc.nextInt();
		
// CHAMANDO O PROCEMENTO CALCULO 
		calculo(N);

		sc.close();
	}
// PROCETIMENTO RECEBENDO UM PARAMENTRO N RETUNANDO S
	public static double calculo(int N) {

		double S = 1, J = 1;
		
// LAÇA FOR 
		for (int i = 1; i <= N; i++) {

			for (int valor = i; valor > 1; valor--) {
				J = J * valor;

			}
			S = S + 1 / J;
		}
		
		System.out.printf("S = %.2f%n ", S);
		
		return S;

	}
}
