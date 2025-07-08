package tem.bin;

import java.time.LocalDate;
import java.util.Scanner;

public class Agecalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth:");
        int yearOfBirth = scanner.nextInt();
        int currentYear = 2025;
        int age = currentYear - yearOfBirth;
        System.out.println("Age: " + age);

        System.out.println("Enter your birth date (YYYY-MM-DD):");
        String dateBirth = scanner.next();
        LocalDate birthDate = LocalDate.parse(dateBirth);
        int yearOfBirth = birthDate.getYear();
        int currentYear = LocalDate.now().getYear();
        System.out.println("The age is: " + (currentYear - yearOfBirth));
    }

}
