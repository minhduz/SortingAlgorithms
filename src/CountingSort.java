import java.util.Arrays;

public class CountingSort {
    public static int[] countSort(int[] inputArray) {
        int N = inputArray.length;
        int M = 0;

        for (int i = 0; i < N; i++) {
            M = Math.max(M, inputArray[i]);
        }

        int[] countArray = new int[M + 1];

        for (int i = 0; i < N; i++) {
            countArray[inputArray[i]]++;
        }

        System.out.println("Count Array 1: "+ Arrays.toString(countArray));

//        for (int i = 1; i <= M; i++) {
//            countArray[i] += countArray[i - 1];
//        }


        for (int i = M - 1; i >= 0; i--) {
            countArray[i] += countArray[i + 1];
        }

        System.out.println("Count Array 2: "+ Arrays.toString(countArray));

        int[] outputArray = new int[N];

        for (int i = N - 1; i >= 0; i--) {
            outputArray[countArray[inputArray[i]] - 1] = inputArray[i];
            countArray[inputArray[i]]--;
        }

        return outputArray;
    }



    public static void main(String[] args) {
        int[] inputArray = {4, 2, 2, 8, 3, 3, 1};
        int[] outputArray = countSort(inputArray);

        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(outputArray[i] + " ");
        }
    }
}
