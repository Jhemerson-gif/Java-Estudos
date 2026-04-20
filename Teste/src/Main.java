
import java.util.Scanner; // Importa a classe Scanner para ler dados digitados pel ousuario

public class Main{ // Declara a classe principal chamada main
	public static void main(String[] args) {// Método principal onde o progmama começa a executar
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite sua idade: ");// Mostra uma mensagem pedindo a idade do usuario
		int idade = scanner.nextInt(); // lê o numero digitado pelo usuario e guarda na variavel idade
		
		//Estrutura condicioal if
		if (idade >= 18){ // verifica se a idade é maior ou igual a 18
		     System.out.println("Você é maior de idade."); // Executa se a condição for verdadeira

		} else { // Caso a condição do if seja falsa

		    System.out.println("Você é menor de idade."); // Executa se a idade for menor que 158

		}

		scanner.close(); // Fecha o objeto Scanner para liberar recursos do sistema
	    	
	}
}