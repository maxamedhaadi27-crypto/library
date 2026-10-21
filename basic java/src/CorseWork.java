import java.util.*;
public class CorseWork {
    static void main() {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter A letter");
        String chart=input.next();
       char char1='A';
       char char2='Z';
       int  number1=10;
//        char charact=input.();
       if (char1 == char2 ^ char1 == char2){
           System.out.println("valid alphepetic letter" ) ;

       }
       else {
           System.out.println("error the message");
       }

       System.out.println("is upper :" +Character.isUpperCase(char1));
        System.out.println("is lower :" +Character.isLowerCase(char2));

        System.out.println("Random letter  in same case"+Math.round(char1));
        System.out.println("Random letter  in same case"+Math.round(char2));

        if (char1 ==char2){
            System.out.println("they are the same");
        }
        else {
            System.out.println("is not Same");
        }
    }
}
