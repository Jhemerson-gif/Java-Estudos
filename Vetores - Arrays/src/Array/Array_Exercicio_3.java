package Array;

public class Array_Exercicio_3 {

	public static void main(String[] args) {

		int[] numeros = {10,20,30,40,50,60};
		
		System.out.println("Elementos na ordem inversa: ");
		
		
		for (int i = numeros.length -1;i >= 0; i--) { // O i adquiri o  tamanho maximo de numeros e vai subtraindo 
			
			System.out.println(numeros[i]);
			
		}
		
	}

}
