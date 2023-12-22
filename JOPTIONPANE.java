package Fundamentos;

import javax.swing.JOptionPane;

public class JOPTIONPANE {
	public static void main(String[] args) {
		String nome, curso;
		int idade;
		nome=JOptionPane.showInputDialog("Entre com o nome");
		 idade = Integer.parseInt(JOptionPane.showInputDialog("Entre com a idade"));
		 curso= JOptionPane.showInputDialog("Entre com o curso");
		 
		 
		 JOptionPane.showConfirmDialog(null, "O nome é " + nome+ " sua idade é  "  +idade+" e seu curso é" + curso  );
		
	}

}
