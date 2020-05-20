import java.util.Scanner;
import java.util.Arrays;

public class GestaoAcademica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// N�mero de alunos para exemplo 
		int totalAlunos = 3;
		
		int alunosAprovados = 0;
		int alunosReprovados = 0;
		int alunosAF = 0;
		double notasAlunos[] = new double[totalAlunos];
		double pontuacaoTotal = 0;
		
		// itera��o para obtermos as notas dos alunos
		for (int i = 0; i < totalAlunos; i++) {
			Scanner b1 = new Scanner(System.in);
			
			System.out.print("Nota da prova - 1o bimestre: ");
			double notaProva1b = b1.nextDouble();
			
			System.out.print("Nota do projeto - 1o bimestre: ");
			double notaProjeto1b = b1.nextDouble();
			
			System.out.print("Lista de exerc�cios - 1o bimestre: ");
			double notaEx1b = b1.nextDouble();
			
			Scanner b2 = new Scanner(System.in);
			System.out.print("Nota da prova - 2o bimestre: ");
			double notaProva2b = b2.nextDouble();
			
			System.out.print("Nota do projeto - 2o bimestre: ");
			double notaProjeto2b = b2.nextDouble();
			
			System.out.print("Lista de exerc�cios - 2o bimestre: ");
			double notaEx2b = b2.nextDouble();
			
			// c�lculo das m�dias bimestrais
			double mediaPrimeiroBimestre = ((notaProva1b * 5) + (notaProjeto1b * 3) + (notaEx1b * 2)) / 10;
			double mediaSegundoBimestre = ((notaProva2b * 5) + (notaProjeto2b * 3) + (notaEx2b * 2)) / 10;

			// c�lculo da m�dia semestral
			double mediaSemestral = (mediaPrimeiroBimestre + mediaSegundoBimestre)/2;
			
			// atribuir a m�dia semestral do aluno a uma vari�vel para o c�lculo posterior da m�dia geral
			pontuacaoTotal += mediaSemestral;
			
			// inserir a m�dia semestral do aluno em uma array para pegarmos a maior e menor notas
			notasAlunos[i] = (double) mediaSemestral;
			
			// itera��o para descobrir quantos alunos temos em cada categoria (aprovados, AF e reprovados)			
			if (mediaSemestral >= 8) {
//				System.out.println("M�DIA SEMESTRAL: " + mediaSemestral + " ALUNO APROVADO!");
				alunosAprovados++;
			} else if (mediaSemestral >= 5 && mediaSemestral <= 7.9) {
//				System.out.println("M�DIA SEMESTRAL: " + mediaSemestral + " ALUNO EM AF!");
				alunosAF++;
			} else {
//				System.out.println("M�DIA SEMESTRAL: " + mediaSemestral + " ALUNO REPROVADO!");
				alunosReprovados++;
			}
		}
		
		// c�lculo da m�dia geral		
		double mediaGeral = pontuacaoTotal/totalAlunos;
		
		// ordenar a array de notas para pegarmos a maior e a menor 
		Arrays.sort(notasAlunos);
		
		System.out.println("M�dia geral da turma: " + mediaGeral);
		System.out.println("Menor nota: " + notasAlunos[0]);
		System.out.println("Maior nota: " + notasAlunos[notasAlunos.length - 1]);
		System.out.println("Alunos aprovados: " + alunosAprovados);
		System.out.println("Alunos reprovados: " + alunosReprovados);
		System.out.println("Alunos em AF: " + alunosAF);
	}

}
