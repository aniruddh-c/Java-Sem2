import java.util.Random;

class SameColourBallException extends Exception {
    SameColourBallException(String message) {
        super(message);
    }
}

public class BallSimulation {
    private static final int NUM_PICKS = 10;

    public static void main(String[] args) {
        int redCount = 0;
        int greenCount = 0;
        int blueCount = 0;
        int yellowCount = 0;

        Random random = new Random();

        for (int i = 0; i < NUM_PICKS; i++) {
            String color = getRandomColor(random);

            if (color.equals("red")) {
                redCount++;
                if (redCount > 4) {
                    handleExceptionAndStop("Red ball picked four times");
                    redCount--;
                    break;
                }
            } else if (color.equals("green")) {
                greenCount++;
                if (greenCount > 4) {
                    handleExceptionAndStop("Green ball picked four times");
                    greenCount--;
                    break;
                }
            } else if (color.equals("blue")) {
                blueCount++;
                if (blueCount > 4) {
                    handleExceptionAndStop("Blue ball picked four times");
                    blueCount--;
                    break;
                }
            } else if (color.equals("yellow")) {
                yellowCount++;
                if (yellowCount > 4) {
                    handleExceptionAndStop("Yellow ball picked four times");
                    yellowCount--;
                    break;
                }
            }

            System.out.println("Picked ball: " + color);
        }

        System.out.println("\nNumber of balls chosen from each color:");
        System.out.println("Red: " + redCount);
        System.out.println("Green: " + greenCount);
        System.out.println("Blue: " + blueCount);
        System.out.println("Yellow: " + yellowCount);
    }

    private static String getRandomColor(Random random) {
        int numColors = 4;
        int index = random.nextInt(numColors);

        switch (index) {
            case 0:
                return "red";
            case 1:
                return "green";
            case 2:
                return "blue";
            case 3:
                return "yellow";
            default:
                return null;
        }
    }

    private static void handleExceptionAndStop(String message) {
        System.out.println(message);
        System.out.println("Stopping the simulation...");
    }
}
