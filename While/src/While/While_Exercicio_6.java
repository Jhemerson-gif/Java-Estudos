package While;

import java.util.Scanner;

public class While_Exercicio_6 {

	public static void main(String[] args) {


		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Contagem de Números Positivos e Negativos");
		
		int numero ;
		int contador = 0;
		int positivo = 0;
		int negativo = 0;
		
		
		while (true) {
			
			System.out.print("Digite numero: ");
			numero = entrada.nextInt();
			if (numero == 0)
				break;
			
			if(numero > 0) {
				
				positivo ++;
				
				
			}else if (numero < 0){
				negativo ++;
			}
			
			contador++;
			
		}
		System.out.println("Total de numeros digitados: "+ contador);
		
		if (positivo > 0) {
			System.out.println("Você digitou "+ positivo + " numeros positivos!");
			
		}else {
			System.out.println("Você digitou nenhum numero positivo !");
		}
		
		if(negativo > 0) {
			
			System.out.println("VocÊ digitou "+ negativo +" numeros negativos!");
		}else {
			
			System.out.println("Você digitou nenhum numero positivo");
		
			
			
		}
		
		entrada.close();
	}

}
