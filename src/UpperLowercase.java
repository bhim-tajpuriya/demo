import java.util.Scanner;
public class UpperLowercase{
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = i.next().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println("It is a lower case");
        }else{
            System.out.println("It is Upper case");
        }
    }
}
