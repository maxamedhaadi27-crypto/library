import java.util.*;
public class Corsework3 {
    static void main() {
    Scanner input=new Scanner(System.in);
       System.out.println(" enter number1");
        int number1=input.nextInt();
        System.out.println("enter number2");
        int number2=input.nextInt( );
        System.out.println("1: Addition  2: subtraction 3: multiplication 4: divide") ;
        int chose=input.nextInt();



      switch (chose){
          case 1 :
              System.out.println( (number1+number2));
              break;
          case 2 :
              System.out.println((number1-number2 ));
              break;
          case 3 :
              System.out.println((number1*number2));
              break;
          case 4 :
              System.out.println((number1/number2));
              break;
          default:
              System.out.println("invalid number");

      }
    }
}
