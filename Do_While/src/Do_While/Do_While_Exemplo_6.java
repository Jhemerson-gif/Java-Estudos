package Do_While;

import java.util.Scanner;

public class Do_While_Exemplo_6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Exercicio - Contar quantos números positivos foram digitados até digitar 0");
		
		int numero;
		int maior= 0;
		int menor= 0;
		do {
			
			System.out.print("Digite numero ( 0 para encerrar o programa) : ");
			
			numero = entrada.nextInt();
			
			if (numero > 0) {
				 maior ++;
			}else if( numero < 0){
				
				menor ++;
			}
			
			
			
			
		}while(numero !=0);
		
		if(maior > 0 ) {
			
			System.out.println("Foi digitado " + maior + " positivos.");
			
		}else {
			
			System.out.println("Não foi digitado numeros positivos.");
			
		}
		
		if(menor > 0 ) {
			
		System.out.println("Foi digitado " + menor + " negativos.");
		
		}else {
			
			System.out.println("Não foi digitado numeros negativos.");
		}
		
		entrada.close();
		

	}

}
