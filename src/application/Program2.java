package application;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// DECLARAÇÃO DE VARIAVEL
		double resultado;
		
		
		// VARIAVEL RESULTADO RECEBENDO UM MODO 
		resultado = calculoSalario();
		System.out.printf("Média de salário da população: %.2f\n ", resultado);

		sc.close();
		
		

	}
	// PROCETIMENTO RETURNANDO MEDIA DO SALARIO 
	public static double calculoSalario() {

		Scanner sc = new Scanner(System.in);
		
		// DECLARAÇÕES DAS VARIAVEL INT, DOUBLE E CHAR;
		int pessoa = 0, totalPessoa = 0, nunFi, totalNunFi = 0;
		double salario, totalSalario = 0, mediaSalario = 0;
		char pesq;
		
		System.out.print("Deseja iniciar a pesquisa S/N: ");
		pesq = sc.next().charAt(0);

		// LOGICA DE REPETIÇÃO PARA EXEUTAR A FLAG ATE DAR FALSO 
		while (pesq == 's' || pesq == 'S') {
			pessoa++;
			System.out.print("Digite o numero de filho: ");
			nunFi = sc.nextInt();
			totalNunFi = totalNunFi + nunFi;
			totalPessoa = totalNunFi + pessoa;
			System.out.print("Digite o salario: ");
			salario = sc.nextDouble();
			totalSalario = totalSalario + salario;
			mediaSalario = totalSalario / totalPessoa;
			
			System.out.println("total de salario: " + totalSalario);
			System.out.println("total de habitantes: " + totalPessoa);
			System.out.println("Media de salario: %.2f\n" + mediaSalario);
			
			
			System.out.print("Deseja continuar a pesquisa S/N: ");
			pesq = sc.next().charAt(0);

		}

		

		return mediaSalario;

	}

}
