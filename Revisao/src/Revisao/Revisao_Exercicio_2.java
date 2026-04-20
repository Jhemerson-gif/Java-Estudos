package Revisao;

public class Revisao_Exercicio_2 {

	public static void main(String[] args) {

		System.out.println("Exercicio 2 : PULAR NÚMEROS ÍMPARES ENTRE 1 E 20");
		System.out.print("Numeros pares: ");
		
		for(int i =1;i <= 20; i++ ) {
			
			if (i % 2 == 1) {
				continue;
				
			}

		System.out.print(i);	
			if (i < 20) {
				
				System.out.print(", ");
				
			}
		
		}
	}

}
