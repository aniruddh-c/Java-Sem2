import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CreateInputFile {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("input.txt"));
            writer.write("This is the first line");
            writer.newLine();
            writer.write("This is the second line");
            writer.close();

            System.out.println("File created successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
