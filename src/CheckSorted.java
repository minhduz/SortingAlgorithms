public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,5,4,4,6,7,8};
        boolean asc = checkSortedAsc(arr);
        boolean des = checkSortedDes(arr);

        boolean as = true;
        boolean de = true;
        for (int i = 0; i <= arr.length-2; i++) {
            if (arr[i] > arr[i + 1]) {
                as = false;
            }else if (arr[i] < arr[i + 1]) {
                de = false;
            }
            if(!as && !de) break;
        }

        if(as){
            System.out.println("sorted, ascending");
        }else if(de){
            System.out.println("sorted, descending");
        }else {
            System.out.println("not sorted");
        }

        if(asc){
            System.out.println("sorted, ascending");
        }else if(des){
            System.out.println("sorted, descending");
        }else {
            System.out.println("not sorted");
        }
    }

    public static boolean checkSortedAsc(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false; // Array is not sorted
            }
        }
        return true; // Array is sorted
    }

    public static boolean checkSortedDes(int[] arr) {
        for (int i = arr.length-1; i >= 1; i--) {
            if (arr[i] > arr[i - 1]) {
                return false; // Array is not sorted
            }
        }
        return true; // Array is sorted
    }
}
