package DSAQuestions;

public class ValidPalindromeII {


    public static boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                // Case: mismatch → try skipping either side
                return isPalindrome(s, left+1, right) || isPalindrome(s, left, right-1);
            }
            left++;
            right--;
        }

        return true;
    }

    // Helper method to check if substring s[left...right] is a palindrome
    public static boolean isPalindrome(String s, int left, int right) {
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String test1 = "abca";
        System.out.println("Test 1: " + validPalindrome(test1)); // expected output: true

        String test2 = "abc";
        System.out.println("Test 2: " + validPalindrome(test2)); // expected output: false

        String test3 = "deeee";
        System.out.println("Test 3: " + validPalindrome(test3)); // true
    }
}

/*
 * Time Complexity: O(n)
 * - We scan the string once (O(n)).
 * - In case of mismatch, we check a substring once (still O(n)).
 * - Total stays O(n).
 *
 * Space Complexity: O(1)
 * - Only uses pointers (left, right), no extra memory.
 */