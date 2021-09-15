import java.util.Scanner;

public class Method_Domaci2 {
	public static int myMethod1(int a, int b, int c) {
	{
		if (a <= b) {

			a = b;

		}

		if (a >= c) {

			return a;

		} else {

			return c;

		}
	}
	}

	static int zbir(int a, int b, int c) {
		
		return a + b + c;
		
		
		
	}
		



	
	

	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite 3 cela broja: ");
		System.out.println("Prvi broj: ");
		int a = sc.nextInt();
		System.out.println("Drugi broj: ");
		int b = sc.nextInt();
		System.out.println("Treci broj: ");
		int c = sc.nextInt();
		
		System.out.println("Rezultat: " + myMethod1(a, b, c));
		System.out.println("Zbir: " + zbir(a, b, c));

	}

}
