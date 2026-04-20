
public class Matriz_Exercicio_6 {
	
	public static void main(String[] args) {
		
		int[][] matriz = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		
		int[] temp = matriz[0];
		
		matriz[0] = matriz[2]; // move a a posição da linha 2 para a posição 0
		
		matriz[2] = temp; // passou a posição da linha 0 para a matriz 2
		
		System.out.println("Matriz após troca de linhas: ");
		
		for (int[] linha: matriz) {
			
			for (int valor : linha) {
				
				System.out.print(valor + " ");
			}
			System.out.println();

		
		}
	}

}
