public class Ex3 {
    static void main() {
        int counter=1;
        int total=0;
        while (counter<=10){
            if (counter%2==0){
                total+=counter;
                System.out.println(total);
            }
            counter++;
        }
        System.out.println(total);
    }
}
