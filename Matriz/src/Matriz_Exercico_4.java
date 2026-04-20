
public class Matriz_Exercico_4 {
	
	public static void main(String[] args) {
		
		int[][] matriz = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		int par = 0;
		int impar = 0;
		int total = 0;
		int pares =0;
		for (int i = 0; i < matriz.length; i++) {
			
			for (int c = 0; c < matriz.length; c++) {
			
				if (matriz[i][c] % 2 == 0) {
					
					par++;
				}else {
					
					impar++;
				}
			}
		total++;
			
		}
		
		System.out.println("Foram digitados "+ par +" numeros pares.");
		System.out.println("Foram digitados "+ impar +" numeros impares.");
		System.out.println("Foram digitados "+ total +" numeros no total");
		
		
		System.out.println("---------------------------------------");
		
		System.out.println("Fazendo de segunda maneira");
		
		for (int[] linha : matriz) { // pode passar por valores indefinidos
			
			for(int valor : linha) {
				
				if (valor %2 ==0) {
					
					pares++;
					
				}
			}
		}
		
		System.out.println("Foram digitados "+ pares +" numeros pares.");
	}
}
