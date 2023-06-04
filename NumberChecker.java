import java.util.Scanner;

class OutOfRangeException extends Exception {
    OutOfRangeException(String message) {
        super(message);
    }
}

public class NumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        try {
            if (number < 10 || number > 50) {
                throw new OutOfRangeException("Number is out of range.");
            } else {
                int square = number * number;
                System.out.println("Square of the number: " + square);
            }
        } catch (OutOfRangeException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
