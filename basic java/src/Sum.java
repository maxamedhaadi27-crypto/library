import java.util.Scanner;

public class Sum {
    static void main() {
        int sum=0;
        Scanner in=new Scanner(System.in);
        System.out.print("enter a number add");
        System.out.print("or press 0 to exit /n");
        int num=in.nextInt();
        while (num!=0){
            System.out.print("enter a number ");
            sum+=num;
            num= in.nextInt();



        }
        System.out.println("the sum of numbers "+sum);

    }
}
