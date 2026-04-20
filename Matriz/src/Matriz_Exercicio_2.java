import java.util.Scanner;

public class Matriz_Exercicio_2 {

	public static void main(String[] args) {
		
		System.out.println("Exercicio 2 - Ler uma matriz 2x2 do usuário");
		
		Scanner entrada = new Scanner(System.in);
		
		int  linha = 0;
		
		int[][] matriz = new int [2][2];

		
		while (linha < 2) { // Linha da matriz
		
			int col = 0;
			
			while(col <2) { // Coluna da matriz
			
			System.out.print("Digite o valor da posição ["+ linha +"][" + col + "]: ");
			
			matriz[linha][col] = entrada.nextInt();
			
		
			
			col++;
			}
		linha++;
		
		}
		System.out.println();
		System.out.println("Matriz preenchida ...");
		System.out.println();
		
		for (int i = 0; i < 2; i++) { // linha
			for (int j = 0; j <2; j++) { // coluna
			
				System.out.print(matriz[i][j]+ " ");
		
			}
			System.out.println();
		}
		entrada.close();

	}

}
