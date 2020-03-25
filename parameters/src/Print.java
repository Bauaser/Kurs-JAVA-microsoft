public class Print {
    public static void main (String[] args) {
        printStrings("Kocham cię najbardziej na świecie Paulinko! \n Twój Michaś\n", 9);
    }
    public static void printStrings(String abc, int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(abc);
        }
    }
}