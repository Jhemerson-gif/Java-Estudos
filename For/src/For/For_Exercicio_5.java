package For;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import java.util.List;

public class For_Exercicio_5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite palavras separadas por vígula: ");
		
		String linhaDigitada = entrada.nextLine();
		
		List<String> palavras = Arrays.asList(linhaDigitada.split(","));
		
		for (String item: palavras) {
			
			item = item.trim();
			
			if (item.length() > 4) {
				
				System.out.println(item);
			}
		}

	}

}
