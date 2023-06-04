import java.util.Scanner;

class NegativeAmountException extends Exception {
    NegativeAmountException(String message) {
        super(message);
    }
}

public class UserDefinedExceptionHandling {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the amount: ");
            double amount = scanner.nextDouble();

            try {
                if (amount < 0) {
                    throw new NegativeAmountException("Invalid Amount");
                } else {
                    System.out.println("Amount Deposited");
                }
            } catch (NegativeAmountException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
