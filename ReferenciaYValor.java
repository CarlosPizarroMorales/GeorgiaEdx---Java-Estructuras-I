import java.util.Scanner;

public class ReferenciaYValor
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    String b = sc.nextLine();               // Se supone "Hola"
	    
	    
		String a = "Hola";                      
		System.out.println("Hola" == a);        // true
		System.out.println("Hola" == b);        // false
		System.out.println(b.equals("Hola"));   // true
		System.out.println(a.equals("Hola"));   // true
		System.out.println(a.equals(b));        // true
		System.out.println(a == b);             // false
	}
}