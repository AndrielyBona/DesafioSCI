package Desafio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Java5 {
	public static void main(String[] args) {
		// definindo a formatação de saída das médias
		DecimalFormat df = new DecimalFormat("0.00");
		
		Scanner leitor = new Scanner(System.in);

		String nomeAlunos[] = new String[3];
		Float[][] notasAlunos = new Float[3][4];
		double[] medias = new double[3];
		double maiorMedia = 0;
		double menorMedia = 0;
		String nomeMaiorMedia = "";
		String nomeMenorMedia = "";
		
		// Entrada de Dados
		for (int i = 0; i <= 2; i++) {
			System.out.println("informe o nome do " + (i + 1) + "º aluno:");
			nomeAlunos[i] = leitor.nextLine();

			double acumulaNotas = 0;
			// Informando Notas
			for (int j = 0; j <= 3; j++) {
				System.out.println("Informe a " + j + "ª nota: ");
				notasAlunos[i][j] = leitor.nextFloat();
				acumulaNotas += notasAlunos[i][j];
			}
			leitor.nextLine();
			// Calculando Média
			double media = acumulaNotas / 4;
			medias[i] = media;
		}
		char primVez = 'S';
		
		for (int i = 0; i <= 2; i++) {
			if (primVez == 'S') {
				maiorMedia = medias[i];
				nomeMaiorMedia = nomeAlunos[i];
				menorMedia = medias[i];
				nomeMenorMedia = nomeAlunos[i];
				primVez = 'N';
			}
			if (medias[i] > maiorMedia) {
				maiorMedia = medias[i];
				nomeMaiorMedia = nomeAlunos[i];
			} else if (medias[i] < menorMedia){
				menorMedia = medias[i];
				nomeMenorMedia = nomeAlunos[i];
			}
		}
		System.out.println("***************  RELAÇÃO DAS MÉDIAS *****************");
		for (int i = 0; i < 3; i++) {
			System.out.println("Aluno: " + nomeAlunos[i] + " - Média: " + df.format(medias[i]));
		}

		System.out.println("Aluno com maior média: " + nomeMaiorMedia + " - Média: " + df.format(maiorMedia));
		System.out.println("Aluno com menor média: " + nomeMenorMedia + " - Média: " + df.format(menorMedia));
		leitor.close();
		System.out.println("Programa Finalizado");
	}
}
