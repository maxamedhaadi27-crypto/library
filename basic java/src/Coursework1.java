import java.util.*;
public class Coursework1 {
    static void main() {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your marks");
        int marks=input.nextInt();
        if (marks>50){
            System.out.println("you are passed");
        }
        else {
            System.out.println("you are failed");
        }
    }
}
