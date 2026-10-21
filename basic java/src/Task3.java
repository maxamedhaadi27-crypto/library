import java.util.*;
public class Task3 {
    static void main() {
        Scanner input=new Scanner(System.in);
        System.out.println("enter yor initial balance");
        int balance=input.nextInt();
        System.out.println("enter your make deposit");
        double deposit=input.nextInt();

        double total=balance+deposit;
        System.out.println("enter yor initial balance"+balance);
        System.out.println("enter your make deposit"+deposit);
        System.out.println("enter your total"+total);




    }
}
