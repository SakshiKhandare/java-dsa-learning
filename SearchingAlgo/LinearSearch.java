package SearchingAlgo;


public class LinearSearch {

    static int linearSearch(int[] arr, int target) {

        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null");
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at index: " + i);
                return i;
            }
        }
        System.out.println("Element not found");
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;

        int result = linearSearch(arr, target);

        if (result != -1) {
            System.out.println("Search successful. Index: " + result);
        } else {
            System.out.println("Search unsuccessful.");
        }
    }

}
