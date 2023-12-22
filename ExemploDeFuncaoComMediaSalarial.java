package Fundamentos;

import java.security.PublicKey;
import java.util.Scanner;



public class ExemploDeFuncaoComMediaSalarial {
	
	static double  media (double c, double q ) {

		double media = (c/q);
		return media;
	}
	public static void main(String[] args) {
Scanner Funcionario;
Funcionario =  new Scanner (System.in);

//-----------------------------------------------------------
double sal;
double soma=0;

for ( int c =1 ; c <= 3; c++) {

System.out.println("Entre com o valor de entrada do "+c+"º salário");
sal = Funcionario.nextDouble();
soma = sal+soma;




System.out.println("O salário atual é aproximadamente" +soma+" ");

//-----------------------------------------------------------
}
///AQUI É UTILIZADO O RETORNO DA FUNCAO (media=c=soma/q=3)
double mediat;

mediat = media (soma,3);
System.out.println("________________________________________________________________________________");
System.out.println("A média é = " +mediat);

	}
	}


