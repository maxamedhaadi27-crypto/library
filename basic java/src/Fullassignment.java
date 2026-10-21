import java.rmi.MarshalException;
import java.util.Scanner;
public class Fullassignment {

    static void unviversity(){
        int total=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your fullName");
        String FullNme=input.nextLine();
        System.out.println("enter Student id");
        String id=input.nextLine();
        System.out.println("enter your email");
        String email=input.nextLine();
        System.out.println("enter mark four subjects 0 and 100");
        int Subjects= input.nextInt();
        System.out.println("enter subject1");
        int subject1=input.nextInt();
        System.out.println("enter subject2");
        int subject2=input.nextInt();
        System.out.println("enter subject3");
        int subject3=input.nextInt();
        System.out.println("enter subject4");
        int subject4=input.nextInt();
        if (FullNme .equals("mohamed haadi")){
            System.out.println("valid name");
        }

        else {
            System.out.println("invalid");
        }
        if (id .equals("stdid1234 ")){
            System.out.println("valid id");
        }
        if (email .equals("mohamedhadi@gmaail.edu ")){
            System.out.println("valid email");
        }
        if (Subjects ==4){
            System.out.println("valid subject");
        }

      for (int i=1; i<4;i++){

          System.out.println("enter your marks" +i);
          int marks=input.nextInt();
          if (marks<0 || marks>100){
              System.out.println("invalid marks");
              System.out.println("enter your marks" +i);
          }
          int avg=0;

          if (marks>50){
              System.out.println("your are pass");
          }
          else {
              System.out.println("you are failed");
          }
          System.out.println(Math.max(marks,100));
          System.out.println(Math.min(marks,0));

          System.out.println();

      }








    }
    static void main() {
        int  Total=0;
        unviversity();
    }
}
