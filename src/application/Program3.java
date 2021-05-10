package application;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// DECLARAÇÃO DE VARIAVEL
		int N, n1 = 0, n2 = 0, n3 = 0, resultado;

		System.out.print("Escreva quantas vez sera executado o programa: ");
		N = sc.nextInt();
		
		// LOGICA DE REPETIÇÃO PARA EXEUTAR ATÉ N NUMEROS QUE SERA DIGETADO NO TECLADO
		for (int i = 0; i <= N; i++) {
			resultado = ordem(n1, n2, n3);
			System.out.println(resultado);

		}

		sc.close();
	}
	// MODO COM PARAMENTRO QUE VAI REALIZAR ALOGICA PARA ORDENAR OS NUMEROS EM ORDEM 
	public static int ordem(int n1, int n2, int n3) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Primeiro numero: ");
		n1 = sc.nextInt();
		System.out.print("Segundo numero: ");
		n2 = sc.nextInt();
		System.out.print("Terceiro numero: ");
		n3 = sc.nextInt();
		
// CONDICIONAMENTO QUE VAI TESTAR TODAS AS POSSIBILIDADE DE ENTRE OS TREIS NUMEROS INTEIROS 
		if ((n1 < n2) && (n2 < n3)) {
			System.out.println(n1 + "-" + n2 + "-" + n3);
		} else if ((n1 < n3) && (n3 < n2)) {
			System.out.println(n1 + "-" + n3 + "-" + n2);
		} else if ((n2 < n1) && (n1 < n3)) {
			System.out.println(n2 + "-" + n1 + "-" + n3);
		} else if ((n2 < n3) && (n3 < n1)) {
			System.out.println(n2 + "-" + n3 + "-" + n1);
		} else if ((n3 < n1) && (n1 < n2)) {
			System.out.println(n3 + "-" + n1 + "-" + n2);
		} else {
			System.out.println(n3 + "-" + n2 + "-" + n1);
		}

		return ordem(n1, n2, n3);
	}

}
