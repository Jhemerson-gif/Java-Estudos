
import java.util.Scanner;

public class While_Exercicio_10 {
	
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
	
	
		int num1;
		int num2;
	

		
		while  (true){
			
				System.out.print("Digite um numero: ");
	
				num1 = entrada.nextInt();
		
				System.out.print("Digite outro numero: ");
		
				num2 = entrada.nextInt();
			
			
			if (num1 != num2) {
				
				System.out.println("Numeros diferentes tente novamente");
			}else {
				
				System.out.print("Você acertou os numeros !");
				break;
			}
			
			
		}

		entrada.close();
	
	
	}
}
