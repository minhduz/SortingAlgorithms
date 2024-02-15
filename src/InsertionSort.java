/**
 *
 * @author apple
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j] >= arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        System.out.print("Mang sau khi sap xep: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
