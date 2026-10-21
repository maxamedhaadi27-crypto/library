import java.util.*;
public class Coursework2 {
    static void main() {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the numbers");
        int even;
        int odd;
        int numbers=input.nextInt();
        if(numbers%2 == 0){
            System.out.println("even number");
          if (numbers==2){
              System.out.println("positive Number");
          }
          if (numbers%2==0 && numbers==2){
              System.out.println("positive Numbers");
          }
        }
        else {
            System.out.println("odd number");
        }
    }
}
