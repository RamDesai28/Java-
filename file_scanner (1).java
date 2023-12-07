import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class file_scanner {
    public static void main(String[] args) {
        // Specify the path to the file you want to read
        String filePath = "sample.txt";

        try {
            // Create a File object with the specified file path
            File file = new File(filePath);

            // Create a Scanner to read from the file
            Scanner scanner = new Scanner(file);

            // Read and display the contents of the file line by line
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            // Close the scanner
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
    }
}
