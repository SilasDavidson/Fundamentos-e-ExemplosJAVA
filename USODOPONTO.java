package Fundamentos;

public class USODOPONTO {
public static void main(String[] args) {
	String s = "Tudo bem X";
	// String fica em maiuscula
			s = s.toUpperCase();
			System.out.println(s);
			
			// De substituição 
			s = s.replace("X" , "Amigo");
			s = s.toUpperCase();
			System.out.println(s);
			
			String a = "Tudo joia Y"; a=a.replace("Y", "Amigo");a= a.toUpperCase();
			System.out.println(a);
}
}
