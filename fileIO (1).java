import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class fileIO {
    public static void main(String[] args) {
        String filename = "sample.txt"; // Replace with the path to your text file

        int vowelCount = 0;
        int wordCount = 0;
        int charACount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+"); // Split the line into words
                wordCount += words.length; // Increase word count

                for (String word : words) {
                    charACount += word.length() - word.replace("a", "").length(); // Count occurrences of 'a'
                    for (char c : word.toLowerCase().toCharArray()) {
                        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                            vowelCount++; // Increase vowel count
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }

        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of 'a' occurrences: " + charACount);
    }
}