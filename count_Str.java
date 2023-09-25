 // Write a java program to find total number of alphabets, digits or special character in a string.
import java.util.Scanner;

public class count_Str {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int alphabetCount = 0;
        int digitCount = 0;
        int specialCharCount = 0;

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                alphabetCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else {
                specialCharCount++;
            }
        }

        System.out.println("Alphabets: " + alphabetCount);
        System.out.println("Digits: " + digitCount);
        System.out.println("Special Characters: " + specialCharCount);

        scanner.close();
    }
}


