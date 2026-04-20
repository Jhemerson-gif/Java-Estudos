package While;

import java.util.Scanner;

public class While_Exercicio_8 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Tabuada de mutiplicação");
		
		
		
		int numero;
		int cont = 0;
		
		
		System.out.println("Digite um numero: ");
		
		numero = entrada.nextInt();
		
		System.out.println("A taboa de: "+ numero);
		
		while (cont != 10) {
			cont++;
			int multi = numero *cont;
			
			System.out.println(numero + " x " + cont + " = "  + multi);
			
		}
		entrada.close();
	}

}
