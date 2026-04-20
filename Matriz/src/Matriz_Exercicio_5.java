
public class Matriz_Exercicio_5 {

	public static void main(String[] args) {
		
		
		int[][] matriz = {
				{1,2},
				{3,4},
				{5,6}
		};
		
		System.out.println("Matriz trnasposta: ");
		
		for(int i = 0; i < 2; i++) {
			
			for (int c = 0; c < 3; c++) {
				
				System.out.print(matriz[c][i]+ " "); // Basta inverter a ordem de impressão  invertando a linha e a coluna.
			}
			System.out.println();
			
		}

	}

}
