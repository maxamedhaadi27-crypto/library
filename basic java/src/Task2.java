import java.util.*;
public class Task2 {
    static void main() {
        Scanner input=new Scanner(System.in);
        System.out.println("enter Number of course ");
        int NumberOfCourse=input.nextInt();
        System.out.println("enter the price of course ");
        int PriceOfCourse=input.nextInt();
        int total=NumberOfCourse*PriceOfCourse;
        System.out.println("enter the number of course "+NumberOfCourse);
        System.out.println("enter the Price of course"+PriceOfCourse);
        System.out.println("enter the total :"+total);

    }
}

