package application;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Procedimento acionado!!");

		// CHAMADA O PROCEDIMENTO 
		triangulo();

		sc.close();
	}

// PROCEDIMENTO QUE VAI RETURNA O  MODO TRIANGULO QUE VAI EXECUTAR TODA LOGICA DENTRO
	public static double triangulo() {
		Scanner sc = new Scanner(System.in);
		double X, Y, Z;

		System.out.println("Digite o valor de X: ");
		X = sc.nextDouble();
		System.out.println("Digite o valor de Y: ");
		Y = sc.nextDouble();
		System.out.println("Digite o valor de Z: ");
		Z = sc.nextDouble();

// CONDICIONAMENTO PARA TESTA OS VALORES INSERIDOS PARA EXIBIR QUAL TRIANGULO É COM BASE NO VALORES.
		if ((X == Y) && (X == Z)) {
			System.out.println("Triagulo Equilátero");
		} else if ((X != Y) && (X == Z)) {
			System.out.println("Triagulo Isósceles");
		} else if ((X != Z) && (X == Y)) {
			System.out.println("Triagulo Isósceles");
		} else if ((Z != X) && (Y == Z)) {
			System.out.println("Triagulo Isósceles");
		}

		else if ((X != Y) && (Y != Z)) {
			System.out.println("Triagulo Escaleno");
		}
		return triangulo();

	}
}
