package org.launchcode.java.exercises.dataTypes;

import java.util.Scanner;

public class RemoveStringUtil {

    private static String searchableString = "Alice was beginning to get very tired of sitting by her sister on the bank, "
            + " and of having nothing to do: once or twice she had peeped into the book her sister was reading, "
            + "but it had no pictures or conversations in it, 'and what is the use of a book,' "
            + "thought Alice 'without pictures or conversation?'";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a word to remove: ");
        String userIn = in.nextLine();

        int indexOfWord = searchableString.toLowerCase().indexOf(userIn.toLowerCase());
        int wordLength = userIn.length();
        System.out.println("Index of " + userIn + " is " + indexOfWord + ", length of the word is " + wordLength);

        String replacementString = searchableString.substring(0, indexOfWord) + searchableString.substring(indexOfWord + wordLength, searchableString.length() - 1 );
        System.out.println(replacementString);
    }
}