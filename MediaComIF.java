package Fundamentos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MediaComIF {
	public static void main(String[] args) {
		Scanner Aluno;
		Aluno=new Scanner (System.in);
		String nome;
		int NOTA1 ;
		int NOTA2;
		int NOTA3;
		
		
		
	
		System.out.println("Digite seu nome:");
		nome = Aluno.next();
		System.out.println("Digite sua primeira nota");
		NOTA1 = Aluno.nextInt();
		System.out.println("Digite sua segunda nota");
		NOTA2 = Aluno.nextInt();
		System.out.println("Digite sua terceira nota");
		NOTA3 = Aluno.nextInt();
		
		double media = (NOTA1+NOTA2+NOTA3)/3;
		 /// AQUI É UTILIZADO O IF PARA CALCULAR A MEDIA
				if ( media>=7) {
			System.out.println("Parabéns, sua nota foi acima da média, esse semestre você fico com uma média de " + media +" no total. Parrabéns !!!");
		} else {
				System.out.println("Bora estudar mais, sua média não foi muito boa.  A sua  média  foi de " + media );
			}
	}		
	}

