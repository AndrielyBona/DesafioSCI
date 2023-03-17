package Desafio;
import java.util.Scanner;
public class Java4 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		float[] numeros = new float[5];
		
		// Entrada de Dados
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite o " + (i+1) + "º número:");
			numeros[i] = leitor.nextInt();
		}
		// Imprimindo saída
		System.out.println("Valor na posição 3: " + numeros[2]);
		leitor.close();	
		System.out.println("Programa Finalizado");
	}
}