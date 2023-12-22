package Fundamentos;

import java.util.Scanner;


public class PROCEDIMENTO {
	
	
	
	/// COM O STATIC É DECLARADO O PROCEDIMENTO
	static void soma (int n1, int n2) {
		
		int soma = n1+n2;
		System.out.println("O resultado é = " + soma);
	}
	/// PARA O PROCEDIMENTO É UTILIZADO METODO DO TIPO STATIC VOID	
	public static void main(String args [])	{
		
		Scanner Numero;
		Numero = new Scanner (System.in);
		
		int n1,n2,result;
		System.out.println("Digite o primeiro número número:");
		n1= Numero.nextInt();
		System.out.println("Digite o seg numero");
		n2=Numero.nextInt();
/// ABAIXO ESTA O RETORNO DO PROCEDIMENTO
		soma(n1,n2);
		
		
	
}
	
}

