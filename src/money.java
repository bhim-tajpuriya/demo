import java.util.Scanner;
public class money {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount:");
        int amount = sc.nextInt();
        if(amount>=1000){
            int thousandcount = amount/1000;
            amount= amount-thousandcount*1000;
            System.out.println("ThousandCount="+thousandcount);
        }if(amount>=500){
            int fivehundredcount = amount/500;
            amount = amount-fivehundredcount*500;
            System.out.println("Fivehundredcount="+fivehundredcount);
        }if(amount>=100){
            int hundredcount= amount/100;
            amount= amount-hundredcount*100;
            System.out.println("HundredCount="+hundredcount);
        }if(amount>=50){
            int fiftycount = amount/50;
            amount= amount-fiftycount*50;
            System.out.println("FiftyCount=" +fiftycount);
        }if(amount>=20){
            int twentycount = amount/20;
            amount= amount-twentycount*20;
            System.out.println("TwentyCount=" +twentycount);
        }if(amount>=10){
            int tencount = amount/10;
            amount= amount-tencount*10;
            System.out.println("TenCount=" +tencount);
        }if(amount>=5){
            int fivecount = amount/5;
            amount= fivecount-amount*5;
            System.out.println("FiveCount" +fivecount);
        }if(amount>=2){
            int twocount = amount/2;
            amount= twocount-amount*2;
            System.out.println("TwoCount=" +twocount);
        }if(amount>=1){
            int onecount = amount/1;
            amount= amount-onecount*1;
            System.out.println("OneCount=" +onecount);
        }
    }
}
