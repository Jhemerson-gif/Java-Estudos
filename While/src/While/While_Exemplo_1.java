package While;

public class While_Exemplo_1 {
	
	public static void main(String[] args) {
		
		System.out.println("\n1. Contar de 1 até 5 com while \n");
		
		int contador =1;
		
		while (contador <= 5){
		
			System.out.println("Contador: " + contador);
		
			contador ++;
			
		}
		System.out.println("\n 2. Contagem regressiva de 5 até 1 com while \n");
		
		int numero = 5;
		
		while(numero >= 1 ) {
			
			System.out.println("Contador: "+ numero);
			
			numero --;
			
		}
		
		System.out.println("\n3 Soma dos numeros de 1 até 10 com while \n");
		
		int soma = 0;
		int i = 1;
		
		while(i <= 10) {
		
			System.out.print(i);
			while ( i < 10) {
				
			
			System.out.print(" + ");
				break;
			}	
			
		soma+=i;
		i++;
				
				}
		System.out.println();
		System.out.println("A soma de 1 até 10 é : " + soma );

	}

}
