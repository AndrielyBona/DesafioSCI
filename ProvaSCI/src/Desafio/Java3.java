package Desafio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Java3 {
	public static void main(String[] args) {
		// definindo a formatação de saída das médias
		DecimalFormat df = new DecimalFormat("0.00");

		Scanner leitor = new Scanner(System.in);

		String nomeAluno;
		double notaAluno, acumNotas = 0;
		double mediaAluno;
		char fimProg = 'N';

		// Entrada de dados
		while (fimProg == 'N') {
			// Informa o nome do aluno
			System.out.println("Informe o nome do aluno: ");
			nomeAluno = leitor.nextLine();
			// Entrada de Notas do aluno
			for (int nota = 0; nota < 4; nota++) {
				System.out.println("Informe a " + nota + "ª nota do aluno: ");
				notaAluno = leitor.nextDouble();
				acumNotas += notaAluno;
			}
			// calculando a média do aluno
			mediaAluno = (acumNotas) / 4;
			// Imprime nome e média do aluno
			System.out.println("Nome Aluno: " + nomeAluno);
			System.out.println("Media do aluno: " + df.format(mediaAluno));

			// Testa situação do aluno e mostra se aprovado
			if (mediaAluno < 6) {
				System.out.println("Aluno Reprovado");
			} else {
				System.out.println("Aluno Aprovado");
			}

			// inicializa acumulador de notas para o próximo aluno
			acumNotas = 0;

			// Verifica se prossegue no programa
			System.out.println("Finaliza programa ?(S/N)");
			fimProg = leitor.next().charAt(0);
			// limpa buffer do scanner para não pular linha quando informar o próximo aluno
			leitor.nextLine();
		}
		leitor.close();
		System.out.println("Programa Finalizado");
	}
}