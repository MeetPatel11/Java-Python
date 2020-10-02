package one;

import java.util.Scanner;

public class Letter_Counter_App {
    public static void main(String[] args) {
        System.out.println("Welcome to Letter Counter App");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The string : ");
        String str = scan.nextLine();

        str = str.toLowerCase();
        str = str.replace(" ", "");
        char[] new_char;
        new_char = str.toCharArray();

        System.out.print("Enter the Letter that you want to count in small letter : ");
        char letter = scan.next().charAt(0);

        int count = 0;

        for (char c : new_char) {
            if (c == letter) {
                count++;
            }
        }
        System.out.println("The letter " + letter + " comes for " + count + " times");
    }
}
