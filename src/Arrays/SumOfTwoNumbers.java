package Arrays;

public class SumOfTwoNumbers {


    public static void main(String[] args) {
        int [] arrayNumber = {3,7,1,2,8,4,5};
        int target = 10;
        System.out.println(sum (arrayNumber,target));

    }
    static boolean sum (int[] arrayNumbers, int targetNumber){
        for (int i = 0; i < (arrayNumbers.length-1); i++) {
            for (int j = (i+1); j < arrayNumbers.length; j++) {
               if(arrayNumbers[i] + arrayNumbers[j] == targetNumber){
                   System.out.println("Pair with a given sum " + targetNumber +
                           " is (" + arrayNumbers[i] + ", " + arrayNumbers[j] + ")");
                   return  true;
               }
            }
        }
        return false;
    };

}
