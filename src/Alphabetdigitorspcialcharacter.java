import java.util.Scanner;
public class Alphabetdigitorspcialcharacter {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = i.next().charAt(0);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("digit");
        } else {
            System.out.println("Special symbol");
        }
    }
}