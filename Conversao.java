package Fundamentos;

public class Conversao {
	public static void main(String[] args) {
		
		//CONVERSAO IMPLICITA 
		double a=2.2446666966666;
		System.out.println(a);
		
		
		float b = (float ) 2.2446666966666; //CONVERSAO EXPLICITA(CAST)
		System.out.println(b);
		
		//AO EXECUTAR O FLOAT NÃO ACEITARA TODOS OS NÚMEROS DEVIDO ELE NÃO ACEITAR EM BYTS MAS CONVERTEU
		
		int c= 128;
		byte d= (byte) c;
		System.out.println(d);
		// O BYTE É ATE 128 ENTAO AO CONVERTER ELE VAI PARA O VALOR MAIS PROXIMO
		
		double x= 1.9999;
		int s=(int) x;
		System.out.println(s);
		
	//_-___________________________________________________________________________________________________________________________________________________
		
		
		
		
		// O s ignora a parte quebrada visto que é um inteiro
	}

}
