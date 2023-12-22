package Fundamentos;

import java.util.Scanner;

public class FUNÇÃO {
	
	
	
	
	/// A DIFERENÇA DO PROCEDIMENTO É QUE NA PARTE DA FUNÇÃO TIRA O >> VOID<<< E TEM O >> RETURN
	
	static int  soma (int n1, int n2) {
		int soma = n1+n2;
		
		return soma;
	}
	
	/// AQUI É IGUAL PARA TODOS, POIS É O METODO QUE É O INICIO DO CÓDIGO
	public static void main (String [] args) {
		int n1,n2, result;
		Scanner Numero;
		Numero = new Scanner (System.in);
		
		System.out.println("Digite  o número ");
		n1=Numero.nextInt();
		System.out.println("Digite  o número ");
		n2=Numero.nextInt();	
		
		/// AGORA NESSE CASO A VAR RESULT RECEBE SOMA
		 
		result= soma (n1,n2);
		
		System.out.println(" O resultado é " + result);
		
		
		
		
	}
	
	}


