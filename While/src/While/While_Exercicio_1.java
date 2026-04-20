package While;

public class While_Exercicio_1 {

	public static void main(String[] args) {
		
		int inicio = 1;

		System.out.println("Contando de 1 a 100: ");
		
		while (inicio <= 100) {
			
			System.out.print(inicio);
			
			inicio++;
			
			while (inicio <= 100) {
				
				System.out.print( " -> ");
				
			break;
			}
		}
	}

}
