import java.util.Scanner;

public class UserInput {
    public static void main(String [] args){

        Scanner myScanner = new Scanner(System.in);
        System.out.print("Print first initial: ");
        String firstInitial = myScanner.next();
        System.out.print("Print last name: ");
        String lastName = myScanner.next();
        System.out.print("Print house number: ");
        int houseNumber = myScanner.nextInt();
        System.out.print("Print street name: ");
        String streetName = myScanner.next();
        System.out.print("Print Street type: ");
        String streetType = myScanner.next();
        System.out.print("Print city: ");
        String city = myScanner.next();

        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);
    }
}
