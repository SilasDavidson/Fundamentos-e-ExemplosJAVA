package Fundamentos;

import java.util.Scanner;

public class SWITH {
	public static void main(String[] args) {
		
		Scanner bebê = new Scanner (System.in);
		
		
		/// Basicamente se eu alterar a var numero ira responder a partir do case 1,2 ou 3
		
		System.out.println("Digite a idade da criaça ");
		int numero = bebê.nextInt();

		
		switch (numero ) {
		case 1:
			System.out.println("Sabe andar.");
			
		case 2: case 3:
			System.out.println("A partir dos 2 anos sabe falar mamae. ");
			
			
		case 4: case 5:
			System.out.println(" 3 anos que massa!!! então ela já sabe conversar. ");
			/// O break finaliza ( Até o final da chave do switch)
			
			break;
			
					
		
		}
		System.out.println("fim");
	}

}
