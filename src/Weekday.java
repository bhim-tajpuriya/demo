import java.util.Scanner;
public class Weekday {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the day");
        int a = i.nextInt();
        if (a == 1) {
            System.out.println("Sunday");
        }
        if (a == 2) {
            System.out.println("Monday");
        }
        if(a==3){
            System.out.println("Tuesday");
        }
        if(a==4){
            System.out.println("Wednesday");
        }
        if(a==5){
            System.out.println("thrusday");
        }
        if(a==6){
            System.out.println("frieday");
        }
        if(a==7){
            System.out.println("saterday");
        }
    }
}
