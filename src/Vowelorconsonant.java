import java.util.Scanner;
public class Vowelorconsonant {
    public static void main(String[] args){
        Scanner ch= new Scanner(System.in);
        System.out.println("Vowel or consonant");
        char c= ch.next().charAt(0);
        if(c=='a' || c=='A' ||c=='e' ||c=='E'||c=='i' ||c=='I' ||c=='o' ||c=='O' ||c=='u' ||c=='U') {
            System.out.println("The input alphabet is vowel!");
        }else{
            System.out.println("The input alphabet is consonant");
        }
    }
}
