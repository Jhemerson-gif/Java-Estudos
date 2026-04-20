package Revisao;

public class Revisao_Exercicio_7 {

	public static void main(String[] args) {
		
		int contador = 0;
		int num = 1;
		while(true) {
			
			
			if (num % 4 == 0) {
				
				System.out.print(num + " ");
				
				contador++;
				
				if (contador  == 10) {
				
				break;
				}
			}
			num++;
		}

	}

}
