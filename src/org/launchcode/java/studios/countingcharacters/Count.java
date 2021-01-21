package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Count {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string to count:");
        String countThis = input.nextLine();
        countThis = countThis.toUpperCase();
        HashMap<Character, Integer> countedThat = new HashMap<>();

        char[] charactersInString = countThis.toCharArray();

        for (char c : charactersInString) {
            if (!countedThat.containsKey(c)) {
                countedThat.put(c, 1);
            } else {
                int counter = countedThat.get(c);
                countedThat.put(c, counter += 1);
            }
        }

        for (Map.Entry<Character, Integer> count : countedThat.entrySet()) {
            System.out.println(count.getKey() + ": " + count.getValue());
        }



    }

}
