package If;

import java.util.Scanner;

public class Exercicio_8 {

	public static void main(String[] args) {


		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a sua primeira nota !");
		
		double nota1 = entrada.nextDouble();
		
		System.out.print("Digite a segunda nota !");
		
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2) /2;
		
		
		if (media >= 7) {
			
			System.out.println("Aprovado");
			System.out.print("A média é de "+media);
			
		}else if(media >= 5 || media <=6.9){
			
			System.out.println("Recuperação");
			System.out.print("A média é de "+media);
		
		}else {
			
			System.out.println("Reprovado");
			System.out.print("A média é de "+media);
		}
		
		entrada.close();

	}

}
