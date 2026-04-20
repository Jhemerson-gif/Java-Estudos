package Alg;

public class Aula1 { // Declara a classe do programa

	public static void main(String[] args) { // Método principal onde o programa começa
		
		int numero = 10; // Cria a variável numero e inicia com  o valor 10
		
		while (numero>=1) { // Enquanto o número for maior ou igual a 1, o loop continua
			
			System.out.println(numero); // Mostra o valor atual do número na tela
			
			numero --; // Diminui 1 do número ( numero = numero - 1)
			
			if (numero < 1) {
			System.out.println("Fim da Contagem!");
			}
		}

	}

}
