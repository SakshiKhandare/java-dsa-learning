package String;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // If you want single word
        String name = sc.next();
        System.out.println("Single word: " + name);

        sc.nextLine(); // consume the leftover newline before nextLine()

        // If you want full name
        String fullName = sc.nextLine();
        System.out.println("Full line: " + fullName);

        String fruit = "Mango";

        System.out.println(fruit.equals("mango"));
        // false → because "Mango" != "mango" (case-sensitive)

        System.out.println(fruit.equalsIgnoreCase("mango"));
        // true → case doesn't matter here

        System.out.println(fruit.length());
        // 5 → total letters in "Mango"

        System.out.println(fruit.charAt(2));
        // 'n' → character at index 2 (0-based: M=0, a=1, n=2)

        System.out.println(fruit.indexOf("g"));
        // 3 → 'g' is at index 3

        System.out.println(fruit.isEmpty());
        // false → since "Mango" is not empty

        System.out.println(fruit.isBlank());
        // false → it's not blank, contains characters

        System.out.println(fruit.toUpperCase());
        // MANGO → converts to uppercase

        System.out.println(fruit.toLowerCase());
        // mango → converts to lowercase

        System.out.println(fruit.replace('M','T'));
        // Tango → replaces 'M' with 'T'
    }

}
