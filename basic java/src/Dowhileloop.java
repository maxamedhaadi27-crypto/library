import java.util.Scanner;

public class Dowhileloop {
    static void main() {
        Scanner in=new Scanner(System.in);
        System.out.println("make sure a choice");
        int choice;
        do {
            System.out.println("1.learn");
            System.out.println("2.pick a test");
            System.out.println("3.exit");
            choice= in.nextInt();
        }
        while (choice!=3);
    }
}
