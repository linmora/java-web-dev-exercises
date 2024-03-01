package org.launchcode.java.exercises.dataTypes;

import java.util.Scanner;

public class SearchStringUtil {

    private static String searchableString = "Alice was beginning to get very tired of sitting by her sister on the bank, "
            + " and of having nothing to do: once or twice she had peeped into the book her sister was reading, "
            + "but it had no pictures or conversations in it, 'and what is the use of a book,' "
            + "thought Alice 'without pictures or conversation?'";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a search term: ");
        String userIn = in.nextLine();

        System.out.println(searchableString.toLowerCase().contains(userIn.toLowerCase()));
    }
}
