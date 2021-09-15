import java.util.Scanner;


public class kviz_4 {



    public static void main(String[] args) {


        String nl = System.lineSeparator();

        Scanner scanner = new Scanner(System.in);

        String drzava, grad,

                fra = "Francuska", ita = "Italija", srb = "Srbija",

                pariz = "Pariz", rim = "Rim", bg = "Beograd", izlaz = "Izlaz",

                koji = "Koji je glavni grad ",tacan = "Odgovor je tacan", nije = "Odgovor NIJE tacan";

        System.out.print("Dobrodosli" + nl);

        do {

            System.out.print("Izaberite drzavu" + nl + fra + nl + ita + nl  + srb + nl + izlaz + nl);

            drzava = scanner.next();

            if (drzava.equalsIgnoreCase(fra)) {

                System.out.println(koji + fra);

                grad = scanner.next();

                if (grad.equalsIgnoreCase(pariz)) {

                    System.out.println(tacan);

                } else {

                    System.out.println(nije);
                  
                }

            } else if (drzava.equalsIgnoreCase(ita)) {

                System.out.println(koji + ita);

                grad = scanner.next();

                if (grad.equalsIgnoreCase(rim)) {

                    System.out.println(tacan);

                } else {

                    System.out.println(nije);
                  
                }

            } else if (drzava.equalsIgnoreCase(srb)) {

                System.out.println(koji + srb);

                grad = scanner.next();

                if (grad.equalsIgnoreCase(bg)) {

                    System.out.println(tacan);

                } else {

                    System.out.println(nije);
               
                }

            }

        } while (!drzava.equalsIgnoreCase(izlaz));

    }

}
	