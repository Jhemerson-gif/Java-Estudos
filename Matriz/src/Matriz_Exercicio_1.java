
public class Matriz_Exercicio_1 {

	public static void main(String[] args) {
		
		System.out.println("Exercicio 1 - Criar e imprimir matriz 3x3");
		
		int[][] numero ={
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		
		for (int n = 0; n < 3; n++) {
			
			for (int l = 0; l <  3; l++) {
				
				System.out.print(numero[n][l]+ " ");
			}
			System.out.println();
			
		}
		System.out.println("Fim do programa.");
		
	}

}
