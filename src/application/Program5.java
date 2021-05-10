package application;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		
		System.out.print("Digite a quantidade de Aluno: ");
		N = sc.nextInt();
		
		// LOGICA DE REPETIÇÃO PARA EXEUTAR PROCEDIMENTO COM BASE NO VALOR QUE SERA INSERIDO NO N
		for(int i=0; i<=N; i++) {
			// CHAMANDO O PROCEDIMENTO 
			conceito();
		}
		System.out.print(" Fim do processo!! ");
		sc.close();
	
	
	}
	//PROCEDIMENTO QUE VAI RETURNA A MEDIA FINAL 
	public static double conceito() {
		Scanner sc = new Scanner(System.in);
		
		double mediaFinal;
		System.out.print("Digite média final do aluno: ");
		mediaFinal = sc.nextDouble();
		
		// CONDICIONAMENTO PARA TESTAR O VALORES DE NOTAS E RETORNA UM VALOR BOOLEAN QUE VAI SE ENQUADRAR EM UM CONCEITO 
		if(mediaFinal <= 39) {
			System.out.println("Conceito = F");
		}
		else if((mediaFinal >= 40)&&(mediaFinal <= 59)) {
			System.out.println("Conceito = E");
		}
		else if((mediaFinal >= 60)&&(mediaFinal <= 69)) {
			System.out.println("Conceito = D");
		}
		else if((mediaFinal >= 70)&&(mediaFinal <= 79)) {
			System.out.println("Conceito = C");	
		}
		else if((mediaFinal >= 80)&&(mediaFinal <= 89)) {
			System.out.println("Conceito = B");
		}
		else if (mediaFinal >= 90) {
			System.out.println("Conceito = A");
		}
		
		return mediaFinal;
	}
}
