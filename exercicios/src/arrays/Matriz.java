package arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);

	System.out.println("Qunatos alunos? ");
	int qtdeAlunos = entrada.nextInt();

	System.out.println("Qunatas notas por alunos? ");
	int qtdeNotas = entrada.nextInt();

	double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotas];

	double total = 0;
	for (int a = 0; a < notasDaTurma.length; a++) {
	    for (int n = 0; n < notasDaTurma[a].length; n++) {

		System.out.printf("Informe a nota %d do aluno %d: ", n, a);
		notasDaTurma[a][n] = entrada.nextDouble();
		total += notasDaTurma[a][n];

	    }
	}
	double media = total / (qtdeAlunos * qtdeNotas);
	System.out.println("Média da turma é " + media);
	for(double[] notasDoluno: notasDaTurma) {
	    System.out.println(Arrays.toString(notasDoluno));
	    
	}

	entrada.close();

    }
}
