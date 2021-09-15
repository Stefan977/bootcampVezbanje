import java.util.Scanner;

public class Method_Domaci1 {
	static int myMethod2(int x, int y, int z) {
	
     return x * y * z;
		
		
		
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
		
		System.out.println("Rezultat: " + myMethod2(a, b, c));

	}

}
