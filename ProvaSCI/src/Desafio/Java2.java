package Desafio;

import java.util.Scanner;

public class Java2 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int numero;
		int numeroMaior = 0;
		int numeroMenor = 0;
		char primVez = 'S';

		// Entrada dos números
		for (int i = 1; i <= 5; i++) {
			System.out.println("Digite o " + i + "* número: ");
			numero = leitor.nextInt();
			// Testando maior e menor número
			if (primVez == 'S') {
				numeroMaior = numero;
				numeroMenor = numero;
				primVez = 'N';
			}
			if (numero > numeroMaior) {
				numeroMaior = numero;
			}
			if (numero < numeroMenor) {
				numeroMenor = numero;
			}
		}
		// Mostrando maior e menor número
		System.out.println("O maior número digitado foi: " + numeroMaior);
		System.out.println("O menor número digitado foi: " + numeroMenor);
		leitor.close();
		System.out.println("Programa Finalizado");
	}
}