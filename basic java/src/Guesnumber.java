import java.util.Scanner;

public class Guesnumber {
    static void main() {
        int number = (int) (Math.random()*100);
        Scanner in=new Scanner(System.in);
        System.out.println("guess number between 0---99");
        int guess=-1;
        while (guess!=number){
            System.out.println("enter  a guess number");
            guess = in.nextInt();
            if (guess==number){
                System.out.println("well done");
                break;
            }
            else if(guess>number) {
                System.out.println("you number is higher");

            }
            else
                System.out.println("you number is lower");
        }



    }
}
