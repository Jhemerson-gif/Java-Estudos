package Alg;

import java.util.Scanner;

public class Aula13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[5];
		
		
		for(int i = 0; i < numeros.length; i++){
			
			System.out.print("Digite o numero: ");
			
			numeros[i] = sc.nextInt();
			
		}
		System.out.println("Resultado:");
		for(int i = 0; i < numeros.length; i++) {
			verificarParImpar(numeros[i]);
			
			
		}
	sc.close();
	}
	
	public static void verificarParImpar(int numeros) {
		int par= 0;
		int impar = 0;
		if(numeros % 2 == 0) {
			
			System.out.println(numeros+ " é Par");
			par++;
			
		}else {
			
			System.out.println(numeros + " é Impar");
			impar++;
		}
			}

}
