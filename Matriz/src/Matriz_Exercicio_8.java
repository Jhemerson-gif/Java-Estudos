
public class Matriz_Exercicio_8 {

	public static void main(String[] args) {


		int [][] matriz = {
				{10,20,30},
				{40,50,60},
				{70,80,90}
		};
		
		int pos = 50;
		
		boolean encontrado = false;
		for (int i= 0; i < matriz.length; i++) {
			
			for (int c = 0; c < matriz.length; c++) {
				
				System.out.println(matriz[i][c]);
				
				if(matriz[i][c] == 50) {
					
					System.out.println("Valoro encontrado na posição: [" + i + "] na coluna [" + c + "]");
					
					encontrado = true;
					
					break;
					
					
				}
			}
			
			if (encontrado) {
				break;
			}else {
				System.out.println("Valor não encontrado!");
			}
		}

	}

}
