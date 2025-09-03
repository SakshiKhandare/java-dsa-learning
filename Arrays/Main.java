package Arrays;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Arrays used to store multiple values in single variable

        String[] fruits = {"apple", "mango", "kiwi", "banana", "pear"};

        System.out.println(fruits[2]);          // output: kiwi

        // update value
        fruits[2] = "litchi";
        System.out.println(fruits[2]);          // output: litchi

        // Another way to declare an array
        int[] nums = new int[3];
        Scanner sc = new Scanner(System.in);

//        nums[0] = 10;
//        nums[1] = 20;
//        nums[2] = 30;

        // taking input for an array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        // printing an array
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}