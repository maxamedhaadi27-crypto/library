import java.util.Scanner;

public class Valuereturnmethod {
    public static int add(int a,int b){
        return a+b;
    }

    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number1");
        int num1=input.nextInt();
        System.out.println("enter num2");
        int num2=input.nextInt();
        System.out.println(add(num1,num2));

    }
}
