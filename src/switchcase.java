import java.util.Scanner;
public class switchcase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Quetion number:");
        int questionNumber = scanner.nextInt();
        switch (questionNumber) {
            case 1:
                // find largest amount 3 numbers
                System.out.println("Enter 1st number");
                int a = scanner.nextInt();
                System.out.println("Enter the 2nd number");
                int b = scanner.nextInt();
                System.out.println("Enter 3rd number");
                int c = scanner.nextInt();
                if (a > b) {
                    if (a > c) {
                        System.out.println("max is::" + a);
                    } else
                        System.out.println("max is::" + c);
                } else {
                    if (b > c)
                        System.out.println("max is::" + b);
                    else
                        System.out.println("max is::" + c);
                }
                break;

            case 2:
                System.out.println("Enter the number");
                int num= scanner.nextInt();
                if(num>0){
                    System.out.println("number is positive");
                }
                if(num<0) {
                    System.out.println("number is negative");
                }
                if(num==0) {
                    System.out.println("number is zero");
                }
                break;
            case 3:


                default:
                    System.out.println("Please eneter the valid number");
            }

        }
    }

