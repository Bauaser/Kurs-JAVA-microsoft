import javax.swing.*;
import java.util.*;

public class daysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose a month number");
        var monthNumber = input.nextInt();
        if (monthNumber = 4 ) {
            System.out.println("This month has 30 days");
        } else if (monthNumber = 6 ) {
            System.out.println("This month has 30 days");
        } else if (monthNumber = 9 ) {
            System.out.println("This month has 30 days");
        } else if (monthNumber = 11 ) {
            System.out.println("This month has 30 days");
        }       else if (monthNumber = 2) {
            System.out.println("This month has 28 days");
        } else {
            System.out.println("This month has 31 days");
        }
    }
}