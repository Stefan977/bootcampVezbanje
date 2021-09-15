import java.util.Scanner;

public class For_petlja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj do kojeg se radi sumiranje ");
		int brojN = sc.nextInt();
		int suma = 0;
		
        for(int i = 0; i < brojN; i++) {
        	suma = suma + i;
        	
        	
        }
        
        System.out.println("Suma je: " + suma);
     
        sc.close();
	}

}
