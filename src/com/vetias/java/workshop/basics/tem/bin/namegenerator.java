package tem.bin;

import java.util.Scanner;

public class namegenerator {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        String title;
        String color;

        System.out.println("Enter your name:");
        String firstName = scanner.nextLine();

        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.println("Enter your gender:");
        String gender = scanner.nextLine();

        if(gender.equalsIgnoreCase("male"))
        {
          title = "Mr.";
        }
        else
        {
          title = "Ms.";
        }

        System.out.println("Enter your favorite color:");
        color = scanner.nextLine();

        System.out.println("\noutput: ");
        System.out.println("Hello, " + title + " " + firstName + "! You are " + age + " years old and your favorite color is " + color + ".");

        scanner.close();

    }
}