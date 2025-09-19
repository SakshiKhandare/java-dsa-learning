package DSAQuestions;

import java.util.HashMap;

// https://leetcode.com/problems/two-sum/
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        // HashMap to store numbers we've seen so far
        // Key   = number from array (value)
        // Value = its index
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int current = nums[i];
            int complement = target - nums[i];              // the number we need to pair with current
            // Check if complement already exists in the map
            if(map.containsKey(complement)){
                // Found the pair: complement's index + current index
                return new int[]{i, map.get(complement)};
            }
            // Otherwise, store the current number with its index
            map.put(current, i);
        }

        return new int[0];
    }

    public static void main(String[] args) {
        int[] testArray = {2, 7, 11, 15}; // sample input
        int target = 9; // sample target
        int[] result = twoSum(testArray, target);
        System.out.print("Indices for two sum: ");
        for (int idx : result) {
            System.out.print(idx + " ");
        }
    }
}

