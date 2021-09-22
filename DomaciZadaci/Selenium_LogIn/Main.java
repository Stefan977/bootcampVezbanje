package SeleniumOsnove;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fail f = new Fail();
		Pass p = new Pass();
		boolean b = true;
		do {
		System.out.println("Choose your path! " + "\n1. Happy" + "\n2. Sad" + "\n3. Exit");
		Scanner sc = new Scanner(System.in);
		int mode = sc.nextInt();
		
		switch(mode) {
    	
        case 2:
        	f.sad();
        	break;
        case 1:
        	p.happy();
        	break;
        case 3:
        	b = false;
        	sc.close();
        	break;
	}
		
}while (b);
		
}
	
}
