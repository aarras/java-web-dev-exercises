package exercises;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Give length: ");
        int length = input.nextInt();
        System.out.println("Give width: ");
        int width = input.nextInt();

        int area = length * width;

        System.out.println("Area is " + area);

    }
}
