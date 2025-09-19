package DSAQuestions;

import java.util.HashMap;

// https://leetcode.com/problems/valid-anagram/
public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> s1 = new HashMap<>();
        HashMap<Character, Integer> s2 = new HashMap<>();

        // Longer Version
//        for(char ch: s.toCharArray()){
//            if(s1.containsKey(ch)){
//                int count = s1.get(ch);
//                s1.put(ch,count+1);
//            }
//            else
//                s1.put(ch, 1);
//        }

        // Shorter version
        // getOrDefault(ch, 0) → if key exists, return its value; else return 0
        // this avoids writing an if-else for checking key existence

        for(char ch: s.toCharArray()){
            // Step 1: s1.getOrDefault(ch, 0) → get the value if exists, else 0
            // Step 2: s1.getOrDefault(ch, 0) + 1 → increment the value by 1
            // Step 3: s1.put(ch, ...) → put the new value back into the map
            s1.put(ch, s1.getOrDefault(ch,0)+1);
        }

        for(char ch: t.toCharArray()){
            int count = s2.getOrDefault(ch, 0);
            s2.put(ch, count+1);
        }

        return s1.equals(s2);
    }

    public static void main(String[] args) {
        // Sample test cases
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println("Test 1: " + isAnagram(s1, t1)); // expected output: true

        String s2 = "rat";
        String t2 = "car";
        System.out.println("Test 2: " + isAnagram(s2, t2)); // expected output: false
    }
}
/*
 * Time Complexity: O(n + m)
 * - We go through both strings once (n = length of s, m = length of t).
 * - HashMap put/get operations take O(1) on average.
 *
 * Space Complexity: O(1) / O(k)
 * - At most, we store counts of characters.
 * - Since characters are limited (like lowercase English letters → 26),
 *   space is constant → O(1).
 * - More generally, if all Unicode chars were allowed → O(k), where k is unique chars.
 */
