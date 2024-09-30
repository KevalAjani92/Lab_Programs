import java.util.HashMap;
import java.util.Map;

public class B_89 {
    public static void main(String[] args) {
        // Create a HashMap to store key-value pairs
        HashMap<String, String> dictionary = new HashMap<>();

        // Add key-value pairs to the dictionary
        dictionary.put("apple", "A fruit that grows on trees");
        dictionary.put("book", "A set of written or printed pages");
        dictionary.put("car", "A road vehicle, typically with four wheels, powered by an internal combustion engine");

        // Retrieve and print values using keys
        System.out.println("apple: " + dictionary.get("apple"));
        System.out.println("book: " + dictionary.get("book"));
        System.out.println("car: " + dictionary.get("car"));

        // Remove a key-value pair
        dictionary.remove("car");

        // Check if a key exists
        if (dictionary.containsKey("car")) {
            System.out.println("The dictionary contains a definition for 'car'.");
        } else {
            System.out.println("The dictionary does not contain a definition for 'car'.");
        }

        // Iterate over the key-value pairs and print them
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
