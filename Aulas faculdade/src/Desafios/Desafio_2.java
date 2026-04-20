package Desafios;

import java.util.Scanner;

public class Desafio_2 {

	public static double totalVendas(double[] vendas) { // soam total dos preços
		double soma = 0;
		for (int i = 0; i < vendas.length; i++) {
			
			soma += vendas[i];
			
		}
		
		return soma;
		
	}
	
	public static double maisCaro(double[] precos) { // o produto mais caro
		int maior = 0;
		for(int i =1; i < precos.length; i++) {
			
		
			if (precos[i] > precos[maior]) {
				
				maior = i;
				
			}
		}
		return maior;
		
	}
	
	public static double maisBarato(double[] precos) { // o produto mais barato
		
		int barato = 0;
		
		for (int i = 1; i < precos.length; i++) {
			
			
			if (precos[i] < precos[barato]) {
				
				barato = i;
			}
		}
		return barato;
	
	}
	
	public static double desconto10(double preco) { // produtos com desconto de 10% acima de 100 reais
		
		return preco * 0.90;
		
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("\nSistema de Vendas em Java");
		
		String[]produto = new String [5];
		double[]precos  = new double [5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n---------- BEM VINDO A WEB STORE ----------");
		
		System.out.println("\nVamos cadastrar os seus produtos para seu mostruario !");
		
		for (int i = 0; i < 5; i++) { // Cadastro dos produtos e preços
			
			System.out.print("Digite o nome do produto "+ (i+1) +":" );
			produto[i] = sc.nextLine();
			
			System.out.print("Digite o preço do produto: ");
			precos[i] = sc.nextDouble();
			
			sc.nextLine(); // limpar o buffer
			
			System.out.println();
		}
		
		
		System.out.println("---------- PRODUTOS CADASTRADOS ----------");
		
		System.out.println("O total  em valores dos produtos cadastrado é: R$ "+ totalVendas(precos));
		
		double indiceCaro = maisCaro(precos); // o mais caro
		System.out.println("O produto com preço mais alto: "+ indiceCaro);
		
		double indiceBarato = maisBarato(precos); // o mais barato
		System.out.println("O produto com o preço mais barato: "+ indiceBarato);
		
		System.out.println();
		
		
		for (int i = 0 ; i < 5 ; i++) { // Exibição do mostruario
			
			if (precos[i] > 100) {
				
				double precoComDesconto = desconto10(precos[i]);
				System.out.println("O produto "+ produto[i] + " de valor R$ "+ precos[i] + " com o deconto de 10% está custando: R$ "+ precoComDesconto );
			}else {
				
				System.out.println("O produto "+ produto[i] +" está custando: R$ "+ precos[i]) ;
				
			}
		}

	}

}
