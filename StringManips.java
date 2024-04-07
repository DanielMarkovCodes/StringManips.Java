// ***************************************************************
// StringManips.java
//
// Test several methods for manipulating String objects
// ***************************************************************

import java.util.Scanner;

public class StringManips {
    public static void main(String[] args) {
        String phrase = new String("This is a String test.");
        int phraseLength; // number of characters in the phrase String
        int middleIndex; // index of the middle character in the String
        String firstHalf; // first half of the phrase String
        String secondHalf; // second half of the phrase String
        String switchedPhrase; // a new phrase with original halves switched
        String middle3; // substring consisting of the middle three characters of phrase
        String city, state; // variables for storing city and state names
        Scanner scanner = new Scanner(System.in);

        // compute the length and middle index of the phrase
        phraseLength = phrase.length();
        middleIndex = phraseLength / 2;

        // get the substring for each half of the phrase
        firstHalf = phrase.substring(0, middleIndex);
        secondHalf = phrase.substring(middleIndex, phraseLength);

        // concatenate the firstHalf at the end of the secondHalf
        switchedPhrase = secondHalf.concat(firstHalf);

        // Replace all blank characters in switchedPhrase with an asterisk
        switchedPhrase = switchedPhrase.replace(" ", "*");

        // print information about the phrase
        System.out.println();
        System.out.println("Original phrase: " + phrase);
        System.out.println("Length of the phrase: " + phraseLength + " characters");
        System.out.println("Index of the middle: " + middleIndex);
        System.out.println("Character at the middle index: " + phrase.charAt(middleIndex));

        // Task 1: Assign middle3 the substring consisting of the middle three characters of phrase
        middle3 = phrase.substring(middleIndex - 1, middleIndex + 2);
        System.out.println("Middle 3 characters: " + middle3);
        System.out.println("Switched phrase: " + switchedPhrase);

        // Task 2: Prompt the user to enter city and state names
        System.out.println("Enter your hometown city: ");
        city = scanner.nextLine();
        System.out.println("Enter your hometown state: ");
        state = scanner.nextLine();

        // Create and print the new string as described
        String result = state.toUpperCase() + city.toLowerCase() + state.toUpperCase();
        System.out.println("Resulting string: " + result);
        System.out.println();
    }
}


