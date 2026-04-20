package Alg;

import java.util.Scanner;
import java.util.ArrayList;

public class Aula10 {

	public static void main(String[] args) {
		
		
		ArrayList<String> alunos = new ArrayList<>();
		
		ArrayList<Double> notas =  new ArrayList<>();
		
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			
			System.out.print("Digite o nome do aluno: ");
			alunos.add(entrada.nextLine());
			
			System.out.print("Digite a nota do aluno: ");
			
			notas.add(entrada.nextDouble());
			
			entrada.nextLine(); // limpar o buffer do telcado
			
				
		}
		System.out.println("Resultado dos alunos: ");
			
		for(int j = 0; j < alunos.size(); j++) {
			
			verificarAprovacao(alunos.get(j), notas.get(j)); // Chamar a função já passando os nomes e as notas para ela.
			
	
		}
		entrada.close();
		

				
			}
		
			public static void verificarAprovacao(String alunos, double notas) { // função que verifica se o aluno foi aprovado
			if (notas >= 7) {
				
				System.out.println(alunos +" aluno foi aprovado com a nota: "+ notas);
				
			}else {
				
				System.out.println(alunos+" aluno foi reprovado com a nota: "+ notas);
			}
	}
	
	

}
