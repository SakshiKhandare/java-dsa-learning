package DSAQuestions;

import java.util.HashMap;
import java.util.Map;

/**
 * MajorityElementTest
 *
 * This class demonstrates two approaches to solve the "Majority Element" problem:
 * 1. Using a HashMap (O(n) time, O(n) space).
 * 2. Using Boyer-Moore Voting Algorithm (O(n) time, O(1) space).
 *
 * The problem: Given an array of size n, find the element that appears more than n/2 times.
 */

public class MajorityElementTest {

    /**
     * Approach 1: HashMap Counting
     * - Store frequencies of each number.
     * - Return the number whose frequency > n/2.
     * - Time: O(n), Space: O(n)
     */
    public static int majorityElementWithMap(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int n: nums){
            if(map.containsKey(n)){
                int count = map.get(n);
                map.put(n,count+1);
            }
            else{
                map.put(n,1);
            }
        }

//        for (int n : nums) {
//            map.put(n, map.getOrDefault(n, 0) + 1);
//        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                return entry.getKey();
            }
        }

        return -1;
    }

    /**
     * Approach 2: Boyer-Moore Voting Algorithm
     * - Uses a candidate and a counter.
     How it works:
     * - Keep a "candidate" (current winner) and a "count" (its score).
     * - Traverse the array:
     *      • If count == 0 → pick the current number as the new candidate.
     *      • If number == candidate → increase count (candidate gains support).
     *      • Else → decrease count (candidate loses against another number).
     * - Since the majority element appears > n/2 times,
     *   it can never be fully canceled out. It will be the last candidate standing.
     * - Time: O(n), Space: O(1)
     */
    public static int majorityElementBoyerMoore(int[] nums) {

        int count = 0;
        int candidate = -1;

        for (int num : nums) {
            if (count == 0) {
                candidate = num; // pick new candidate
                count = 1;
            } else if (num == candidate) {
                count++; // same as candidate → increase vote
            } else {
                count--; // different → cancel out a vote
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] testArray = {2, 2, 1, 1, 1, 2, 2};

        // Using HashMap approach
        int result1 = majorityElementWithMap(testArray);
        System.out.println("Majority element using HashMap: " + result1);

        // Using Boyer-Moore Voting Algorithm
        int result2 = majorityElementBoyerMoore(testArray);
        System.out.println("Majority element using Boyer-Moore: " + result2);
    }
}
