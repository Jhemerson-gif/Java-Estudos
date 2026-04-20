package For;

public class For_Exercicio_1 {

	public static void main(String[] args) {
		
		System.out.println("Exercicio 1: IMPRIMIR OS NÚMEROS IMPARES DE 1 A 99");
		
		for (int i = 1; i <= 100; i+=2) {
		
			System.out.print(i);
				
			if (i < 99) {
				System.out.print(", ");	
				
			}
			
		
		}
		System.out.print(" Fim da contagem !");
	}

}
