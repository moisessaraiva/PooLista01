//1. Determine e exiba a m�dia aritm�tica de um aluno a partir de suas 4 notas.
package exercicio01;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Double []aluno = new Double[4];
		Double media = 0.0;
		for (int i = 1; i <= aluno.length; i++) {
			System.out.println("Insira a " + i + "�nota do aluno");
			aluno[i-1] = scanner.nextDouble();
			media += aluno[i-1];
		}
		System.out.println("A m�dia do aluno �: " + media);
		
	}
}
