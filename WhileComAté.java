package Fundamentos;

import java.util.Scanner;

public class WhileComAté {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		///Esse valor ("") é um espaço em branco muito utilizado para digitar
		
		String valor = "";
		
		// Aqui utilizando o WHILE e a negação (!) e o equals para saber se é igual a sair.
		while(!valor.equalsIgnoreCase("sair")) { 
			System.out.println("Digite algo e quando quiser terminar escreva SAIR : ");
			valor=entrada.next();
		}
		
	}

}
