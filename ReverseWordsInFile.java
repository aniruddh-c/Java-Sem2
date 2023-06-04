import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReverseWordsInFile {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String reversedLine = reverseWords(line);
                System.out.println(reversedLine);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String reverseWords(String line) {
        String[] words = line.split("\\s+");
        StringBuilder reversedLine = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedLine.append(words[i]).append(" ");
        }
        return reversedLine.toString().trim();
    }
}
