package Fundamentos;


import javax.swing.JOptionPane;

public class ConversaoStringPNumero {
	public static void main(String[] args) {
		
		
		String a = JOptionPane.showInputDialog("Digite o primeiro numero");
		String b = JOptionPane.showInputDialog("Digite o segudo  numero");
		
		///// AGORA Tem-se que converter primitivos em string
		double numero1= Double.parseDouble(a);
		double numero2= Double.parseDouble(b);
		double soma = numero1+numero2;
		double media = soma/2;
		System.out.printf( " A soma é igual %d /n A média é igual d%",soma, media);
		
	
}
}
