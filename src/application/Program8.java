package application;

import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N; 


		System.out.print("Digite o valor de N: ");
		N = sc.nextInt();
		
// CHAMANDO O PROCEDIMENTO 
		funcao(N);
		
		sc.close();
	}
// PROCEMNTO COM PARAMENTRO N  RETURNANDO A VARIAVEL S
	public static double funcao(int N) {

		Scanner sc = new Scanner(System.in);
		double S = 0;
	// LAÇA FOR QUE VAI CALCULAR O FATORIAL COM BASE NO VALOR DE N QUE SERA DIGITADO NO CONSOLE. 			
		for (int i = 1; i <= N; i++) {
	
				S = (Math.pow(2, i) + 1) / (i + 3);
			
			System.out.printf("Valor final: %.2f\n ", S);
		}
		
		return S;

	}
}
