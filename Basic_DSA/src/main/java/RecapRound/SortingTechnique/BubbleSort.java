package RecapRound.SortingTechnique;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {10, 12, 6, 3, 11, 2, 3};
        //step1:: 10,6,3,11,2,3,12
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j + 1 < arr.length; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }
}
