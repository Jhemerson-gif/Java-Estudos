
public class Matriz_Exercicio_7 {

	public static void main(String[] args) {
		
		int[][] m1 = {
				{1,2},
				{3,4}
		};
		
		int[][] m2 = {
				{5,6},
				{7,8}
		};
		
		int [][] soma = new int [2][2];
		
		for (int i = 0; i < m1.length; i++) {
			
			for (int c = 0; c < m1.length; c++) {
				
				soma[i][c] = m1[i][c] + m2[i][c];
				
				
				
			}
		}
		
		for (int[] linha:soma) {
			for(int valor : linha) {
				
				System.out.print(valor + " ");
			}
			
		System.out.println();	
		}
		
	}

}
