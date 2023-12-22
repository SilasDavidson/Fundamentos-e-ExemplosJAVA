package Fundamentos;

public class OpLogicos {
	public static void main(String[] args) {
		boolean cond1= true;
		boolean cond2= 3>7;
		
		/// (==) significa que é igual. true/false, se true aparece true, se false aparece false.
		     //// aqui temos adição 
		System.out.println(cond1 && cond2);
		//// Logo retorna o false, pq 3n é maior q2
		
		///        Esse || é sinal de OU .
		System.out.println(cond1 || cond2);
		/// nesse caso vai ser true.
		
		/// Aqui possui o sinal de NEGAÇÂO( Não true = false
		System.out.println(!cond1);
		
		//  3 N é > 7
		System.out.println(!cond2);
		
		
		// OU EXCLUSIVO ou somente um é verdade ou somente o outro
		System.out.println(cond1 ^ cond2);
		
		// Aqui é true logicamente
		System.out.println(cond1
				&& !cond2);
		
		
		
		
		/// A LOGICA É A MESMA DA TABELA VERDADE
		
		
	}

}