package Exercicios;

import java.util.ArrayList;

public class Lista_Exercicio_2_1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<>();
		
		num.add(5);
		num.add(10);
		num.add(20);
		num.add(15);
		num.add(30);
		
		int soma =0;
		
		for (int numeros: num) {
			soma +=numeros;
		}
		
		System.out.println("A soma dos números é: "+ soma);

	}

}
