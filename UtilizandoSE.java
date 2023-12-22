package Fundamentos;

import java.util.Scanner;

public class UtilizandoSE {
public static void main(String[] args) {
	Scanner Pessoa;
	Pessoa= new Scanner(System.in);
	double n;
	double n2;
	System.out.println("Digite a sua idade:");
	n=Pessoa.nextDouble();
	System.out.println("Digite qual sua projeção para formação, você terá quantos anos: ");
	n2=Pessoa.nextDouble();
	if(n2<=29) { 
		System.out.println("Muito bom, para isso terá que estudar para concurso e mais 5h por dia");
	} else  {
		System.out.println("Bom, continue assim.");

	
	
}
}
}