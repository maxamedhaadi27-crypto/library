public class Shift {
    static void main() {
//        shift
        int[] num= {10,20,30,40};
        int temp= num[0];
        for (int i=0; i<num.length-1;i++){
            num[i] =num[i+1];

        }
        num[num.length-1]=temp;
        for (int j:num){
            System.out.println(j+" ");
        }
    }
}
