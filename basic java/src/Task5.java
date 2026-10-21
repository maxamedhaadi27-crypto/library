import java.util.Scanner;

public class Task5 {
    static void main() {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number of seconds");
        long NumberS=input.nextLong();
        long minutes=NumberS/60;
        double reminds=NumberS%60;
        System.out.println("minutes is" +minutes);
        System.out.println("reminds is" +reminds);


    }
}
