import java.util.Scanner;

import java.util.Scanner;

public class scannerOld {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("On what day of the month were you born?");
        String day = input.next();
        System.out.println("And what month were you born?");
        String month = input.next();
        System.out.println("And what year were you born");
        String year = input.next();
        System.out.println("Born on "+ month +" " + day +" "+ year + "? That's pretty long time you are walking on this world...7th");
    }
}
