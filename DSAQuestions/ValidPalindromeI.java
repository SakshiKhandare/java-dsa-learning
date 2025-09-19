package DSAQuestions;

// https://leetcode.com/problems/valid-palindrome/
public class ValidPalindromeI {

    public static boolean isPalindrome(String s) {

        s = s.toLowerCase();

        int left = 0;
        int right = s.length()-1;

        while(left < right){

            char a = s.charAt(left);
            char b = s.charAt(right);

            // Skip non-alphanumeric chars from left
            if(!Character.isLetterOrDigit(a)){
                left++;
            }
            // Skip non-alphanumeric chars from right
            else if (!Character.isLetterOrDigit(b)) {
                right--;
            }
            else {
                if (a != b) {
                    return false;
                }
                left++;
                right--;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Sample test cases
        String test1 = "hello";
        System.out.println("Test 1: " + isPalindrome(test1)); // expected output: false

        String test2 = " ";
        System.out.println("Test 2: " + isPalindrome(test2)); // expected output: true

        String test3 = "A man, a plan, a canal: Panama";
        System.out.println("Test 3: " + isPalindrome(test3)); // expected output: true
    }
}

/*
 * Time Complexity: O(n)
 * - We check each character at most once from both ends.
 *
 * Space Complexity: O(1)
 * - Only two pointers, no extra data structure.
 */