class OutOfRangeException extends Exception {
    OutOfRangeException(String message) {
        super(message);
    }
}

public class NumberChecker {
    public static void main(String[] args) {
        int number = 25;

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
    }
}
