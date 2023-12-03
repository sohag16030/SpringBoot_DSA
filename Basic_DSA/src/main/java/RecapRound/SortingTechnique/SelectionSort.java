package RecapRound.SortingTechnique;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {12, 15, 10, 19, 8};
        //step1:: 8 12 15 10 19
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
