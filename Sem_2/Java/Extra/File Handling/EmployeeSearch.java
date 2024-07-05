import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EmployeeSearch {
    public static void main(String[] args) {
        String fileName = "abc.txt"; // Change this to your file path
        
        // Enter the name to search
        String nameToSearch = "keval"; // Change this to the name you want to search
        
        try {
            if (searchEmployee(fileName, nameToSearch)) {
                System.out.println("Employee found!");
            } else {
                System.out.println("Employee not found!");
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    private static boolean searchEmployee(String fileName, String nameToSearch) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Normalize both names to lowercase and remove suffixes like "bhai" or "kumar"
                String normalizedLine = line.toLowerCase().replaceAll("\\b(bhai|kumar)\\b", "");
                String normalizedNameToSearch = nameToSearch.toLowerCase().replaceAll("\\b(bhai|kumar)\\b", "");
                if (normalizedLine.equals(normalizedNameToSearch)) {
                    return true;
                }
            }
        }
        return false;
    }
}
