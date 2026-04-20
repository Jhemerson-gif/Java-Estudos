package Set;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Set_Exercicio_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> sorteio = new TreeSet<>();
		
		int vezes = 0;
		
		System.out.println("Bem vindo a Loteria Amongus, digite 6 numeros de 1 a 60");
		
		do{
		
			System.out.print("Digite o numero: ");
			int numeros = sc.nextInt();
			
			if(sorteio.contains(numeros)) {
				
				System.out.println("Numero repertido digite novamente !");
				
				vezes++;
			}else if(numeros > 60 | numeros < 1) {
				
				System.out.println("Numero inexistente dento do sorteio. Digite novamente!");
				
				continue;
				
			}else {
				
				System.out.println("Numero adicionado com sucesso!");
				sorteio.add(numeros);
				
				vezes++;
			}
			
			System.out.println("Os numeros foram digitados até agora: " + sorteio.size());
			
		}while(sorteio.size() < 6);
		
		System.out.println("Seus numeros " + sorteio);
		
		
		sc.close();
		

	}

}
