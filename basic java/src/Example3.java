import java.util.Scanner;
public class Example3 {
    static void main() {
//        create scanner object
        Scanner input=new Scanner(System.in);

        System.out.println("enter Three Numbers :");
        int num1= input.nextInt();
        int num2= input.nextInt();
        int num3= input.nextInt();
        int total= num1+num2+num3;
        System.out.println("the total is : " +total);

    }
}
