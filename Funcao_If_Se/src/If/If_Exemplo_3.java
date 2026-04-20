package If;

import java.util.Scanner;

public class If_Exemplo_3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a nota do aluno: ");
		
		double nota = entrada.nextDouble();
		
		if (nota >= 7) {
			System.out.println("Você está aprovado!");
			
		}else if (nota >=5) {
			System.out.println("Você está de recuperação!");
		
		}else {
			System.out.println("Você está reprovado!");
		}
		

	}

}
