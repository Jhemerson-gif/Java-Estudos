package Array;

import java.util.Scanner;

public class Teste_poo {

	public static void main(String[] args) {
		
		bicicleta minhabicicleta = new bicicleta();
		
		minhabicicleta.marca = "marca";
		minhabicicleta.cor = "Cor";
		minhabicicleta.velocidade = 0;
		
		
		minhabicicleta.acelerar();
		minhabicicleta.freiar();
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a ação desejada (acelerar / freiar)");
		String comando = sc.nextLine();
		
		

	}
	
	class bicicleta() {
		
	String marca;
	String cor;
	int velocidade ;
	
	
	void acelerar() {
		
		velocidade += 5;
		
		System.out.println("A bicicleta acelerou " + velocidade + "km/h");
	}
	
		void freiar() {
		
			velocidade -=0;
			if (velocidade < 0) {
			
				velocidade = 0;
			
				System.out.println("bicicleta está parada .");
			}else {
			
				System.out.println("A bicicleta freiou" + velocidade + "km/h");
			}
		}	
		
	}
	
	

	
	
	

	
}


