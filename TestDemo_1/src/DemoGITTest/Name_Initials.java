package DemoGITTest;

import java.util.Scanner;

public class Name_Initials {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the user's name.
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Split the name into an array of strings.
        String[] nameParts = name.split(" ");

        // Print the initials of the name.
        for (String namePart : nameParts) {
            System.out.print(namePart.charAt(0));
        }

        System.out.println();
    }
}
