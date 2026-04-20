package Desafios;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Desafio_4 {
	
	public static void main(String[] args) {
		
		ArrayList<String> produtos = new ArrayList<>(Arrays.asList("Hamburguer", "Refrigerante", "Pizza"));
		ArrayList<String> pedidos = new ArrayList <>();
		ArrayList<Integer> preco = new ArrayList<>(Arrays.asList());
		
		preco.add(20);
		preco.add(5);
		preco.add(50);
		
		String continuar;
		int total =0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n----- Bem vindo ao Restaurange Amongus -----");
		
		System.out.println("\n -------- Cardapio -------");
		
		
		for(int i = 0; i < produtos.size(); i++) {
			
			System.out.println((i+1)+ "." + produtos.get(i) );
		}
		
		while(true) {
			System.out.println();
			System.out.print("Digite o produto que deseja: ");
			String produ = sc.nextLine();
			
			for (int i =0; i < produtos.size(); i++) {
				
				if (produtos.get(i).equals(produ)) {
					
					i = preco.get(i);
					
					total+=i;
					
					pedidos.add(produ);
				
					System.out.println("O item " + produ + " custa: " + i);
				}
				
			}		
		
			System.out.println("Deseja adicionar mais algum item? (Digite S/N)");
			continuar = sc.nextLine();
			

			
			if(continuar.equals("n")) {
				break;
			}
		}
		
		System.out.println("Os pedidos "+ pedidos +" ,valor total: " + total);
		
		System.out.println("Deseja remover algum item da lista ?");
		String remover = sc.nextLine();
		
		if(remover.equals("s")) {
			
			System.out.println("Digite o item que deseja remover");
			String removido = sc.nextLine();
			
			if (pedidos.contains(remover)) {
				
				pedidos.remove(remover);
				
				System.out.println("Produto removido com sucesso");
				
			}else {
				
				System.out.println("Produto não encontrado !");
			}
		}
		
		
		
	}

}
