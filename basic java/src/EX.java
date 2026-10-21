import java.util.Scanner;

public class EX {
    static void main() {
        Scanner input =new Scanner(System.in);
        System.out.println( "enter tutoin fee of all courses:");
        int subject1 = input.nextInt();
        int subject2 = input.nextInt();
        int subject3 = input.nextInt();
        int total = subject1+subject2+subject3;
        double discount =0.10;
        discount=total*0.10;
        double finalprice=total-discount;
        if ( total >=100){
            System.out.println("the total " +total);
            System.out.println( " the discount is" +discount);
            System.out.println( " the final price is" +finalprice);


                    }
        else {
            System.out.println( " you dont have a discount ");

        }

    }
}

