import java.util.*;
public class Ex5 {
    static void main() {
        int num1,num2,ans;
        final int fixed_round=5;
        int attempt=0;
        int correct_ans=0;
        System.out.println("this addition Quiz ");
        while(attempt<fixed_round){
            num1=(int)(Math.random()*10);
            num2=(int)(Math.random()*10);
            System.out.println("Question" +(attempt+1 )+" : what is : " +num1+"+" +num2+"? ");
            Scanner in=new Scanner(System.in);
            ans=in.nextInt();
            if(ans==num1+num2) {
                System.out.println("correct");
                correct_ans++;

            }
            else {
                System.out.println("wrong");
            }
            attempt++;

    }
        System.out.println("WELL DONE YOU ANSWERED "+correct_ans+" out of"+fixed_round);
}
    }