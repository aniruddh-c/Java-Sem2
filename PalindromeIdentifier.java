import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PalindromeIdentifier {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(getFileNameFromUserInput()));
            List<String> palindromes = new ArrayList<>();

            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (isPalindrome(word)) {
                        palindromes.add(word);
                    }
                }
            }

            outputMethod(palindromes);

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getFileNameFromUserInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the file name: ");
        String fileName = reader.readLine();
        return fileName;
    }

    private static boolean isPalindrome(String word) {
        StringBuilder reversed = new StringBuilder(word).reverse();
        return word.equalsIgnoreCase(reversed.toString());
    }

    private static void outputMethod(List<String> palindromes) throws IOException {
    int totalPalindromes = palindromes.size();
    System.out.println("Total Palindromes: " + totalPalindromes);
    System.out.println("List of Palindromes:");

    BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
    writer.write("List of Palindromes:");
    writer.newLine();
    for (String palindrome : palindromes) {
        System.out.println(palindrome);
        writer.write(palindrome);
        writer.newLine();
    }
    writer.close();
}

}
