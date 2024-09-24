/**
 * This program finds and replaces a substring within a string.
 */
public class SubstringWithinString {

    /**
     * Replaces all occurrences of a substring within a string with another substring.
     *
     * @param originalString The original string.
     * @param toBeReplaced The substring to be replaced.
     * @param replacement The substring to replace with.
     * @return The modified string with replacements.
     */
    public static String replaceSubstring(String originalString, String toBeReplaced, String replacement) {
        if (originalString == null || toBeReplaced == null || replacement == null) {
            throw new IllegalArgumentException("Input strings cannot be null");
        }
        return originalString.replace(toBeReplaced, replacement);
    }

    public static void main(String[] args) {
        String originalString = "Hello, world! Hello, everyone!";
        String toBeReplaced = "Hello";
        String replacement = "Hi";

        String result = replaceSubstring(originalString, toBeReplaced, replacement);
        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + result);
    }
}