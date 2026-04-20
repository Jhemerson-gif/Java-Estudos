package Desafios;

import java.util.Scanner;

import java.util.ArrayList;

public class Sistema_de_notas_em_Java {
	
	public static void main(String[] args) {
		
		ArrayList<String> nomes = new ArrayList <>();
		
		ArrayList<Double> nota1 = new ArrayList<>();
		ArrayList<Double> nota2 = new ArrayList<>();
		double maior  = 0;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Sistema de Notas de Alunos em Java");
		
		for(int i = 0; i < 5; i++) { // loop  das informações da  array
			
			System.out.print("Digite seu nome: ");
			
			nomes.add( sc.nextLine());
			
			System.out.print("Digite a primeira nota:  ");
			
			nota1.add(sc.nextDouble());
			
			System.out.print("Digite a Segunda nota: ");
			
			nota2.add(sc.nextDouble());
			
			sc.nextLine();
			
			System.out.println("-------------------------------");
			
		}
		
		
		for (int i = 0; i < nomes.size(); i++) { // Alunos  avaliados pela função
			
			alunoAprovadoReprovado(nomes.get(i), nota1.get(i), nota2.get(i));
			
		}
		
		
		
		
		System.out.println("-------------------------------"); // Maior e menor nota
		
		System.out.println(Maior(nomes,nota1, nota2));
		System.out.println(Menor(nomes,nota1, nota2));

		sc.close();
	}
	
	
	public static double calcularMedia(double nota1, double nota2) { // Função média

		
		return (nota1 + nota2)/ 2;
		
		
	}
	
	public static void alunoAprovadoReprovado(String nomes, double nota1, double nota2) { // função de avaliação do aluno
		double media = calcularMedia(nota1, nota2);
		
		if (media > 7) {
			
			System.out.println("O aluno "+ nomes + " foi aprovado com a nota: "+ media);
		}else {
			
			System.out.println("O aluno "+ nomes + " foi reprovado com a nota: "+ media);
		}
		
	}
	
	public static String Maior(ArrayList<String> nomes,ArrayList<Double> nota1, ArrayList<Double> nota2) { // função de maior nota
		double maior = 0;
		int alunopos = 0;
		for (int i = 0; i < nota1.size(); i++) {
			
			
			double media = calcularMedia(nota1.get(i), nota2.get(i));
			
			if (media > maior) {
				
				maior = media; 
				alunopos = i; // guarda a informação do indice do nome do aluno
			}
			
			
		}
		return "O aluno com maior nota foi " + nomes.get(alunopos) + " com a média de "+ maior;	 // retorno da função
		
	}
	public static String Menor(ArrayList<String> nomes, ArrayList<Double> nota1, ArrayList<Double> nota2) { // função de menor nota
		
		double menor = 10;
		int alunopos = 0; 
		for(int i = 0; i < nota1.size(); i++) {
		
			double media = calcularMedia(nota1.get(i), nota2.get(i));
			
			if ( media < menor) {
			
				menor = media;
				alunopos = i; // guarda a informação do indice do nome do aluno
			}
		}
		
		return "O aluno com menor nota foi " + nomes.get(alunopos) + " com a média de "+ menor; //  retorno   da função
	}
	

}
