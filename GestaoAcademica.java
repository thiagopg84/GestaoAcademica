import java.util.Scanner;
import java.util.Arrays;

public class GestaoAcademica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Número de alunos para exemplo 
		int totalAlunos = 3;
		
		int alunosAprovados = 0;
		int alunosReprovados = 0;
		int alunosAF = 0;
		double notasAlunos[] = new double[totalAlunos];
		double pontuacaoTotal = 0;
		
		// iteração para obtermos as notas dos alunos
		for (int i = 0; i < totalAlunos; i++) {
			Scanner b1 = new Scanner(System.in);
			
			System.out.print("Nota da prova - 1o bimestre: ");
			double notaProva1b = b1.nextDouble();
			
			System.out.print("Nota do projeto - 1o bimestre: ");
			double notaProjeto1b = b1.nextDouble();
			
			System.out.print("Lista de exercícios - 1o bimestre: ");
			double notaEx1b = b1.nextDouble();
			
			Scanner b2 = new Scanner(System.in);
			System.out.print("Nota da prova - 2o bimestre: ");
			double notaProva2b = b2.nextDouble();
			
			System.out.print("Nota do projeto - 2o bimestre: ");
			double notaProjeto2b = b2.nextDouble();
			
			System.out.print("Lista de exercícios - 2o bimestre: ");
			double notaEx2b = b2.nextDouble();
			
			// cálculo das médias bimestrais
			double mediaPrimeiroBimestre = ((notaProva1b * 5) + (notaProjeto1b * 3) + (notaEx1b * 2)) / 10;
			double mediaSegundoBimestre = ((notaProva2b * 5) + (notaProjeto2b * 3) + (notaEx2b * 2)) / 10;

			// cálculo da média semestral
			double mediaSemestral = (mediaPrimeiroBimestre + mediaSegundoBimestre)/2;
			
			// atribuir a média semestral do aluno a uma variável para o cálculo posterior da média geral
			pontuacaoTotal += mediaSemestral;
			
			// inserir a média semestral do aluno em uma array para pegarmos a maior e menor notas
			notasAlunos[i] = (double) mediaSemestral;
			
			// iteração para descobrir quantos alunos temos em cada categoria (aprovados, AF e reprovados)			
			if (mediaSemestral >= 8) {
//				System.out.println("MÉDIA SEMESTRAL: " + mediaSemestral + " ALUNO APROVADO!");
				alunosAprovados++;
			} else if (mediaSemestral >= 5 && mediaSemestral <= 7.9) {
//				System.out.println("MÉDIA SEMESTRAL: " + mediaSemestral + " ALUNO EM AF!");
				alunosAF++;
			} else {
//				System.out.println("MÉDIA SEMESTRAL: " + mediaSemestral + " ALUNO REPROVADO!");
				alunosReprovados++;
			}
		}
		
		// cálculo da média geral		
		double mediaGeral = pontuacaoTotal/totalAlunos;
		
		// ordenar a array de notas para pegarmos a maior e a menor 
		Arrays.sort(notasAlunos);
		
		System.out.println("Média geral da turma: " + mediaGeral);
		System.out.println("Menor nota: " + notasAlunos[0]);
		System.out.println("Maior nota: " + notasAlunos[notasAlunos.length - 1]);
		System.out.println("Alunos aprovados: " + alunosAprovados);
		System.out.println("Alunos reprovados: " + alunosReprovados);
		System.out.println("Alunos em AF: " + alunosAF);
	}

}
