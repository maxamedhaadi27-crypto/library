import java.util.*;
public class Ex6 {
    static void main() {
//        changing
        int num1=(int)(Math.random()*10);
        int num2=(int)(Math.random()*10);
        Scanner in=new Scanner(System.in);
        System.out.println("what is :" +num1+"+" +num2+"?");
        int ans=in.nextInt();
        while (ans!=num1+num2){
            num1=(int)(Math.random()*10);
             num2=(int)(Math.random()*10);
            System.out.println("wrong answer try agin"+"what is :" +num1+"+" +num2+"?");
            ans=in.nextInt();

        }
        System.out.println("well done");
        ans++;

    }
}
