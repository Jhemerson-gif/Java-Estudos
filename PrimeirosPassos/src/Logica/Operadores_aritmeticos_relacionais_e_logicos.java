package Logica;

public class Operadores_aritmeticos_relacionais_e_logicos {

	public static void main(String[] args) {
		
		
		mostraOperadoresAritmeticos();
		
		System.out.println("--------------------------");
		
		mostraOperadoresRelacionais();
		

	}
	
	public static void mostraOperadoresAritmeticos() {
		
		int a = 10;
		
		int b = 3;
		
		System.out.println("Soma: "+ (a + b));
		
		System.out.println("Subtração: "+ (a - b));
		
		System.out.println("Multiplicação: "+ (a * b));

		System.out.println("Divisão: "+ (a / b));

		System.out.println("Resto da divisão: "+ (a % b));
	}
	
	public static void mostraOperadoresRelacionais() {
		
		int x = 10;
		
		int y = 20;
		
		System.out.println("x é igual a y? " + (x == y));
		
		System.out.println("x é igual a y? " + (x != y));

		System.out.println("x é igual a y? " + (x > y));
		
		System.out.println("x é igual a y? " + (x < y));
		
		System.out.println("x é maior ou igual a 10 ? " + (x >= 10));
		
		System.out.println("x é menor ou igual a 10 ? " + (x <= y));
		
		int idade = 18;
		
		boolean temCarteira = true;
		
		boolean podeDirigir = (idade >= 18) && temCarteira;
		
		boolean podeViajarSozinho = (idade >=18) || temCarteira;
		
		boolean naoTemCarteira = !temCarteira;
		
		System.out.println("Pode dirigir? "+ podeDirigir);
		
		System.out.println("Pode viajar sozinho? " + podeViajarSozinho);
		
		System.out.println("Não tem carteira? " + naoTemCarteira);
		
	}
	

}
