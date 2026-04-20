package While;

import java.util.Scanner;
public class While_Exercicio_5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Calculo de média até digitar -1");
		
		double numero = 0;
		double total = 0;
		int cont = 0;
		
		
		while(numero != -1) {
			
			System.out.print("Digite numero: ");	
			numero = entrada.nextInt();	
			
			
			if(numero != -1) {
				total += numero;
				cont++;
				
				
			}

		}
			
		if(cont > 0){
			double media = (double) total / cont;
			
			System.out.print("A média é de "+ media);			
				
				
		}else {
			
				
			System.out.println("Nenhum número válido foi digitado.");
				
			entrada.close();		
	
			
		}
		
	}

}
