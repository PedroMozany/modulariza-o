package application;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// DECLARAÇÃO DE VARIAVEL
		int N;
		double n1, n2, n3, resultado;
		char opcao;

		System.out.print("Entre com a quantidade de alunos: ");
		N = sc.nextInt();

		// LOGICA DE REPETIÇÃO PARA EXEUTAR ATÉ N NUMEROS QUE SERA DIGETADO NO TECLADO
		for (int i = 0; i <= N; i++) {

			System.out.println("A = Media.");
			System.out.println("P = Media ponderada.");
			System.out.print("Escolha uma das opção para calcular: ");

			opcao = sc.next().charAt(0);

			// CONDICIONAMENTO PARA TESTAR A LOGICA PARA SABER A MEDIA COM PARAMETRO "A"
			if (opcao == 'a' || opcao == 'A') {

				System.out.print("Digite as Notas 1: ");
				n1 = sc.nextDouble();
				System.out.print("Digite as Notas 2: ");
				n2 = sc.nextDouble();
				System.out.print("Digite as Notas 3: ");
				n3 = sc.nextDouble();

				// VARIAVEL RESULTADO RECEBENDO UM MODO COM PARAMENTRO
				resultado = calculoDeNota1(n1, n2, n3);
				System.out.printf("Nota Final da media: %.2f\n", resultado);

				// CONDICIONAMENTO PARA TESTAR A LOGICA PARA SABER A MEDIA PONDERADA COM
				// PARAMETRO "P"
			} else if (opcao == 'p' || opcao == 'P') {

				System.out.print("Digite as Notas 1: ");
				n1 = sc.nextDouble();
				System.out.print("Digite as Notas 2: ");
				n2 = sc.nextDouble();
				System.out.print("Digite as Notas 3: ");
				n3 = sc.nextDouble();
				
				// VARIAVEL RESULTADO RECEBENDO O PROCETIMENTO COM PARAMENTRO 
				resultado = calculoDeNota2(n1, n2, n3);
				System.out.printf("Nota Final da meida ponderada: %.2f\n", resultado);

			} else {
				System.out.println("Opção invalida !! ");
			}

		}

		sc.close();
	}

	// PROCETIMENTO  COM PARAMENTRO QUE VAI REALIZAR CALCULO PARA SABER A MEDIA "A"
	public static double calculoDeNota2(double n1, double n2, double n3) {

		// LOGICA DE CALCULO RETURNANDO A MEDIA
		double p1 = 5, p2 = 3, p3 = 2, media = 0;
		media = (n1 * p1 + n2 * p2 + n3 * p3) / (p1 + p2 + p3);
		return media;
	}

	// PROCETIMENTO COM PARAMENTRO QUE VAI REALIZAR CALCULO PARA SABER A MEDIA PONDERADA "P"
	public static double calculoDeNota1(double n1, double n2, double n3) {

		// LOGICA DE CALCULO RETURNANDO A MEDIA
		double media = 0;
		media = (n1 + n2 + n3) / 3;
		return media;

	}

}
