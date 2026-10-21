import java.util.*;
public class Task4 {
    static void main() {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your two items :");

        int item1= input.nextInt();
        System.out.println("enter your item2 :");
        int item2= input.nextInt();
        int total=item1+item2;
        System.out.println("enter the price of items" +item1+item2 );
        System.out.println("the total price is" +total);
    }
}
