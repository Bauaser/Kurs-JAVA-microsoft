import java.util.*;
public class printStars {

    public static void main(String[]args) {
Scanner in =new Scanner(System.in);
        System.out.println("wskaż potęgę dla liczby 2 a ja wskażę ci tyle gwiazd. ");
        System.out.println(starString(in.nextInt()));
    }
        public static String starString(int n) {
            if (n < 0) {
                throw new IllegalArgumentException();
            } else if (n == 0) {
                return "*";
            } else {
                return starString(n - 1) + starString(n - 1);
            }
        }
}

