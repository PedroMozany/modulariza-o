package application;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
// CHAMANDO O PROCEDIMENTO QUE VAI TESTA N NUMERO SEM CODIÇÃO PARA FINALIZAR 
		calculo();

		sc.close();
	}
// PROCEDIMENTO QUE VAI RETORNO UM VALOR BOOLEAN
	public static boolean calculo() {
		Scanner sc = new Scanner(System.in);
		int N;

		System.out.println("Digite o valor: ");
		N = sc.nextInt();
// CONDICIONAMENTO PARA TESTA SE O VALOR É NEGATIVO OU POSITIVO 
		if (N >= 0) {
			System.out.println("Positivo");
		} else {
			System.out.println("Negativo");
		}
		return calculo();
	}
}
