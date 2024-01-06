package Fundamentos;

import java.util.Scanner;

public class DoWhile {
public static void main(String[] args) {
	Scanner entrada = new Scanner (System.in);
	String texto = " ";
do {System.out.println("Você precisa digitar sair!");
texto=entrada.next();
}
	while (!texto.equalsIgnoreCase("sair"));

System.out.println("Saindo");

	entrada.close();
	

}

}
