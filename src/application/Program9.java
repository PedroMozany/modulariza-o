package application;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;

		System.out.print("Digite a quantidade de aluno: ");
		N = sc.nextInt();
// LAÇO  FOR QUE VAI REPETIR O PROCEMNTO 
		for (int i = 0; i <= N; i++) {
			//CHAMANDO O PROCEDIMENTO 
			notas();

		}

		sc.close();
	}
// PROCEDIMENTO 
	public static double notas() {

		Scanner sc = new Scanner(System.in);
		
		double A, B, C, soma, media;

		System.out.print("Digite as Notas 1: ");
		A = sc.nextDouble();
		System.out.print("Digite as Notas 2: ");
		B = sc.nextDouble();
		System.out.print("Digite as Notas 3: ");
		C = sc.nextDouble();
		soma = A + B + C;
		media = soma / 3;
		System.out.printf("Valor da média: %.2f%n ", media);
		
//CONDICIONAMENTO QUE VAI TESTA A MEDIA DAS NOTAS PARA SABER SE O ALUNO ESTA APROVADO OU REPROVADO RETURNANDO A MEDIA.  
		if (media >= 6) {
			System.out.println("Aprovado!!");
		} else {
			System.out.println("Reprovado!!");
		}
		return media;
	}

}
