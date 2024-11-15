import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadingApp {

    public static void main(String[] args) {
        String filePath = "path/to/your/textfile.txt";
        
        try {
            readFile(filePath);
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (InvalidFileFormatException e) {
            System.err.println("Invalid file format: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("An I/O error occurred: " + e.getMessage());
        }
    }

    public static void readFile(String filePath) throws FileNotFoundException, IOException, InvalidFileFormatException {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!isValidFormat(line)) {
                    throw new InvalidFileFormatException("The file contains invalid format at line: " + line);
                }
                System.out.println(line);
            }
        }
    }

    public static boolean isValidFormat(String line) {
        // Implement your file format validation logic here
        // For example, let's assume the valid format is that each line should not be empty
        return !line.trim().isEmpty();
    }
}

class InvalidFileFormatException extends Exception {
    public InvalidFileFormatException(String message) {
        super(message);
    }
}