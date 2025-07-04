import java.util.Scanner;
import java.util.Arrays;

public class Puzzle{
public static void main(String[] args){


Scanner sc = new Scanner(System.in);


System.out.println("How many words do you want to use? ");

int nTimes = sc.nextInt();
sc.nextLine();
String[] words = new String[nTimes];

System.out.println("List of words:");

for (int i = 0; i < nTimes; i++) {
System.out.print("Enter word " + (i + 1) + ": ");
String input = sc.nextLine().trim();

           
words[i] = input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();

System.out.println("You entered: " + words[i]);
}
Arrays.sort(words);

System.out.println("Final list of words:");
for (int i = 0; i < words.length; i++) {
System.out.println((i + 1) + ". " + words[i]);
}


String continueChoice;

do {
// Asking user to choose special symbol
System.out.print("\nEnter a special symbol to use in the password (e.g. @, #, $, etc.): ");
String special = sc.next();

// Prompting the user to choose 2 different word numbers
int choice1, choice2;
while (true) {
System.out.print("Choose two different numbers from the list: ");
choice1 = sc.nextInt();
choice2 = sc.nextInt();

if (choice1 >= 1 && choice1 <= words.length && choice2 >= 1 && choice2 <= words.length && choice1 != choice2) {
break;
} else {
System.out.println("Invalid choices. Please choose two different valid numbers.");
}
}

// Get selected words
String word1 = words[choice1 - 1];
String word2 = words[choice2 - 1];

// Generating a password
String reversed = new StringBuilder(word1).reverse().toString();

String firstThree = word2.length() >= 3 ? word2.substring(0, 3) : word2;
firstThree = firstThree.substring(0, 1).toUpperCase() + firstThree.substring(1).toLowerCase();

String totalLength = String.valueOf(word1.length() + word2.length());

String password = reversed + special + firstThree + totalLength;

// Check if password starts with a vowel
char firstChar = Character.toLowerCase(password.charAt(0));
boolean startsWithVowel = "aeiou".indexOf(firstChar) != -1;

// Show formatted password
String message = String.format(" Your generated password is: %s", password);
System.out.println(message);

if (startsWithVowel) {
System.out.println("Special Note: Your password starts with a vowel!");
}

// Ask if user is satisfied
System.out.print("\nAre you happy with this password? (yes/no): ");
sc.nextLine(); // consume leftover newline
continueChoice = sc.nextLine().trim().toLowerCase();

} while (!continueChoice.equals("yes"));










/*
System.out.println("Choose  two numbers from the list");

int Choice1 = sc.nextInt();
int Choice2 = sc.nextInt();

if (Choice1 >= 1 && Choice1 <= words.length && Choice2 >= 1 && Choice2 <= words.length) {
    System.out.println("You chose:");
    System.out.println("First number: " + words[Choice1 - 1]);
    System.out.println("Second number: " + words[Choice2 - 1]);
} else {
    System.out.println("Invalid Choice");
}


if (Choice1 >= 1 && Choice1 <= words.length && Choice2 >= 1 && Choice2 <= words.length && Choice1 != Choice2) {
String word1 = words[Choice1 - 1];
String word2 = words[Choice2 - 1];

String reversed = new StringBuilder(word1).reverse().toString();

String firstThree = word2.length() >= 3 ? word2.substring(0, 3) : word2;
firstThree = firstThree.substring(0, 1).toUpperCase() + firstThree.substring(1).toLowerCase();

String special = "@";
String totalLength = String.valueOf(word1.length() + word2.length());

String password = reversed + special + firstThree + totalLength;

// Check if password starts with a vowel
char firstChar = Character.toLowerCase(password.charAt(0));
boolean startsWithVowel = "aeiou".indexOf(firstChar) != -1;

// Formatted output
String message = String.format("The generated password is: %s", password);
System.out.println(message);

if (startsWithVowel) {
System.out.println("Special Note: Your password starts with a vowel!");
    }
} else {
    System.out.println("Your password does not start with a vowel.");
}

*/


}
}
