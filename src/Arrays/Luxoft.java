package Arrays;

public class Luxoft {
        public static void main(String... arg){
            int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            System.out.println(sumPairOfNumber(numbers, 9));
        }

        public static int sumPairOfNumber(int[] numbers, int targetSum){
            boolean state;
            int initSum = 0;

            for (int i = 1; i < numbers.length; i++) {
                for(int j = 0; j < i; j++){
                    state = numbers[i] + numbers[j] == targetSum;
                    if(state) {
                        initSum++;
                        System.out.printf("%d, %d %n", numbers[j], numbers[i]);
                    }
                }
            }
            return initSum;
        }

    }

