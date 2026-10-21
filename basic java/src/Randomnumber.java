public class Randomnumber {
   static void main() {
//        random number
    int[] number = new int[5];

    for (int i=0;i<number.length; i++){
        int randomNum= (int ) (Math.random()*100);
        number[i] =randomNum;

    }
    for (int j :number){
        System.out.println(j +" ");
    }
       System.out.println();
       System.out.println(number[3]);
    }
}
