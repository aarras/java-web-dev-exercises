package exercises;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        int[] numbers = {1, 1, 2, 3, 5, 8};

        for (int i : numbers) {
            System.out.println(i);
        }

        for (int i = 0; i < numbers.length; i += 2) {
            System.out.println(numbers[i]);
        }

        for (int i : numbers) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }

        String splitter = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        String[] splitSpace = splitter.split(" ");

        System.out.println(Arrays.toString(splitSpace));

        String[] splitPeriod =  splitter.split("\\.");

        System.out.println(Arrays.toString(splitPeriod));
    }
}
