package Desafio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Java1 {
	public static void main(String[] args) {
		// definindo a formatação de saída das médias
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner leitor = new Scanner(System.in);

		float numero;
		float numerosPares = 0;
		float numerosImpares = 0;
		float soma = 0;
		float quantidade = 0;

		// Entrada dos números
		for (int i = 1; i <= 5; i++) {
			System.out.println("Digite o " + i + "º numero: ");
			numero = leitor.nextFloat();
			soma += numero;
			quantidade++;
			// verifica se o número é par utilizando operação de módulo com módulo = 2
			// se retornar 0 é par
			if (numero % 2 == 0) {
				numerosPares++;
			} else {
				numerosImpares++;
			}
		}
		// calculando a media
		float media = soma / quantidade;

		// imprimindo saída
		System.out.println("Numeros pares: " + numerosPares);
		System.out.println("Numeros impares: " + numerosImpares);
		System.out.println("Média geral: " + df.format(media));

		leitor.close();
		System.out.println("Programa Finalizado");
	}
}