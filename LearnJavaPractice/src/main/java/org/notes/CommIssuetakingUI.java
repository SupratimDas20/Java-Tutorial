package org.notes;

// Importing the Scanner class from java.util package
import java.util.*;


/***********************************************************************************************************************
 
This is one of those classic little gotchas when using Java’s `Scanner`.
When you use `nextInt()`, it reads only the number (the digits) from the input,
but it doesn’t consume the newline character (`\n`) that’s generated when the user presses Enter.
So when your code immediately calls `nextLine()` afterward, it sees that leftover newline and thinks the user already
entered input—returning an empty string instead of waiting for actual input.

By adding an extra `nextLine()` right after `nextInt()`, you’re basically telling Java:
        “Okay, just grab and discard that leftover newline so I can read fresh input next time.”

***********************************************************************************************************************/
// Defining the class
public class CommIssuetakingUI {
    public static void main(String[] args){
        // Creating a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompting the user to enter their age
        System.out.print("Enter your age: ");
        int age = sc.nextInt(); // Reading the integer input (age)

        sc.nextLine(); // Consuming the leftover newline character

        // Prompting the user to enter their favourite color
        System.out.print("Enter your favourite color: ");
        String color = sc.nextLine(); // Reading the string input (color)

        // Displaying the collected input
        System.out.println("You are " + age + " years old");
        System.out.println("You like the color " + color);

        // Closing the scanner object to prevent resource leak
        sc.close();
    }
}
