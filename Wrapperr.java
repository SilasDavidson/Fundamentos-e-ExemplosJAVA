package Fundamentos;

public class Wrapperr {
		
		//Wrapper sig embrulho
		
		//
		
		public static void main(String[] args) {
			
			///ESSES SÃO  TIPOS PRIMITIVOS
			float f;
			long h;
			short g;
			byte b= 100;
			short a= 200;
			double j=2222;
			boolean o = true;;
			
			//////NÃO SÃO ORIENTADO POIS NÃO POSSUI METODOS, POR EXEMPLO SE DIGITAR  ( a. não aparecerar METODOS)  POR ISSO TEMOS O CHAMAR+DO WRAPPER
			//WRAPER ENVOLVER PAARA QUE O TIPO PRIMITIVO TENHA METODOS
			
			Integer x = new Integer("5");
			
			
			//// AQUI DIGITANDO ( x. HAVERÁ  METODOS)
		     x.compareTo(x);
		      
		     Double a1 = new Double ("5"); 
		     
		    a1.byteValue();
		    
		    //// COMO É LONG no "" PODE SÓ NÚMERO APESAR TE TER UTILIZADO STRING ( METODO STRING)
		    
		    Long x1 = new Long("200");
		    
		    System.out.println(x1);
		    System.out.println(x);
		    
		    
		      //AQUI VAMOS APRENDER A FAZER CONVERSÃO
			//// AQUI TEMOS A UTILIZAÇÃO DO PARSE BOOLEAN PARA CONVERSAO  DO STRING PARA O VALOR BOOlEAN
			Boolean bo = Boolean.parseBoolean("True");
			System.out.println(bo);
			
			///AQUI É CONVERTIDO O  BOOLEAN PARA O VALOR STRING ( bo.toString) ai também conseguir utilizar o .( toUpperCase) que deixa o bo maisculo.
			
			System.out.println(bo.toString().toUpperCase());
			

		}
}