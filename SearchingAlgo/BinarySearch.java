package SearchingAlgo;

public class BinarySearch {

    static int binarySearch(int[] arr, int target){

        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null");
            return -1;
        }
        int start = 0;
        int end = arr.length-1;


        while(start<=end){
            // int middle = (start+end)/2;
            // better way
            int middle = start + (end - start)/2;

            if(target > arr[middle]){
                start = middle + 1;
            } else if (target < arr[middle]) {
                end = middle - 1;
            }
            else{
                System.out.println("Element found at index: " + middle);
                return middle;
            }
        }
        System.out.println("Element not found");
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 90;

        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Search successful. Index: " + result);
        } else {
            System.out.println("Search unsuccessful.");
        }
    }
}
