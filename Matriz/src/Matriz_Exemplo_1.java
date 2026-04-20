import java.util.Scanner;

public class Matriz_Exemplo_1 {

	

	public static void main(String[] args) {
		
		int [][] matriz = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
	
		System.out.println("Exemplo 1 - Imprimindo uma matriz 3 x 3");
		
		for(int linha = 0; linha < 3; linha++) {
			
			for(int coluna = 0; coluna < 3; coluna++) {
				
				System.out.print(matriz[linha][coluna]+ " ");
			}
			
			System.out.println();
		}
		
		System.out.println("---------------------------------------");
		
		System.out.println("Exemplo 2 - Preechendo matriz manualmente ");
		
		int[][] tabela = new int[2][3];
		// linha 1
		tabela[0][0] = 10; 
		tabela[0][1] = 20;
		tabela[0][2] = 30;
		// linha 2
		tabela[1][0] = 40;
		tabela[1][1] = 50;
		tabela[1][2] = 60;
		
		// preenchendo a matriz por posição
		
		for(int i = 0; i < 2; i++) {
			
			for(int col = 0; col < 3; col++) {
				
				System.out.print(tabela[i][col] + " ");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------------");
		
		System.out.println("Exemplo 3 - Soma de todos os elementos da matriz" );
		
		int[][] dados = {
				{5,10},
				{15,20}
		};
		
		int soma = 0;
		
		for(int i = 0; i< dados.length; i++) {
			
			for(int j = 0; j < dados.length; j++) {
				soma += dados[i][j];
				System.out.print(dados[i][j] + " ");
				
				
				
			}
			System.out.println();
			
		}
		System.out.println("A soma total da matris é de: "+ soma);
		
		System.out.println("-------------------------------------");
	
		System.out.println("Exemplo 4 - Maior número da matriz");
		
		int [][] numeros = {
				{7, 2, 9},
				{1, 6, 3}
		};
		
		int maior = numeros[0][0];
		
		for (int n = 0; n < numeros.length ; n++) {
			
			for (int col = 0; col < numeros[n].length; col++) { // o [n] possibilita  verificar a linha na checkagem da coluna
				
				if(numeros[n][col] > maior) {
					
					maior = numeros[n][col];
					
				}
				
			}
			
		}
		System.out.println("O MAIOR NUMERO: "+ maior);
		
		System.out.println("-------------------------------------");
		
		System.out.println("Exemplo 5 - Diagonal principal da matriz ");
		
		int [][] quadrada = {
				
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		for (int i = 0; i > quadrada.length; i++) {
			
			System.out.println(quadrada[i][i]);
		}
		
	}
	

}
 