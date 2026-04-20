
public class Matriz_Exercicio_3 {

	public static void main(String[] args) {
		
		int[][] numeros = {
				{1,2,3},
				{4,5,6}
		};
		
		int soma = 0;
		int soma2 =0;
		int total = 0;
		int total2 = 0;
		
		System.out.println("Exemplo 1:");
		System.out.println();
		

		for (int i = 0; i < numeros.length; i++) {
			
			for (int c = 0; c < numeros[i].length; c++) {
				
			soma += numeros[i][c];
		
			
			total++;
			
			
			}
		}
		double media =(double) soma / total;
		System.out.println("A média aritmerica é de: " + media);
		
		
		System.out.println("-----------------------------");
		
		System.out.println("Exemplo 2:");
		System.out.println();
		
		for(int[] linha : numeros) {
			for (int valor : linha) {
			
			soma2 += valor;
			
			total2++;
			}
		}
		double media2 = (double) soma2 / total2;
		
		System.out.println("A Segudna média aritmetica é de: "+ media2);
		
		
		
	}
	
	
	

}
