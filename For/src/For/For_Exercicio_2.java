package For;

public class For_Exercicio_2 {

	public static void main(String[] args) {
	
		System.out.println("Os numeros multiplos de 3 entre 1 e 100.");
		
		for (int i = 1; i <= 100; i++) {
			
			
			if(i % 3 == 0) {
				
				System.out.print(i);
				
				if (i < 99) {
					
					System.out.print(", ");
				}
				
				
			}
		}
		System.out.print(" Fim do Programa !");

	}

}
