import java.util.HashMap;
import java.util.Map;

public class ARSDemo {
    public static void main(String[] args) {
        // Create a HashMap to store key-value pairs
        HashMap<Integer, String> map = new HashMap<>();

        // Adding elements to the HashMap
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // Display the HashMap
        System.out.println("Initial HashMap: " + map);

        // Removing an element from the HashMap
        map.remove(2);
        System.out.println("After removing key 2: " + map);

        // Searching for an element in the HashMap
        if (map.containsKey(1)) {
            System.out.println("Key 1 is present with value: " + map.get(1));
        } else {
            System.out.println("Key 1 is not present");
        }

        // Iterating over the HashMap
        System.out.println("Iterating over the HashMap:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}