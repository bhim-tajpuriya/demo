import java.util.Scanner;
public class Alphabetornot {
    public static void main(String[] args){
        Scanner ch= new Scanner(System.in);
        System.out.println("Input the character");
       char c= ch.next().charAt(0);
        if(c>='a' && c<='z' || c>='A' && c<='B') {
            System.out.println("The input character is alphabet");
        }else{
            System.out.println("The input character is not a Alphaber");
        }
    }
}
