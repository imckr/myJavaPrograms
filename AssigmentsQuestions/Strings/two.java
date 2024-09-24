/**
 * This program counts the number of vowels and consonants in a given string.
 */
public class VowelsCounter {

    /**
     * Main method to run the program.
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        String input = "Hello World";
        int[] counts = countVowelsAndConsonants(input);
        System.out.println("Number of vowels: " + counts[0]);
        System.out.println("Number of consonants: " + counts[1]);
    }

    /**
     * Counts the number of vowels and consonants in a given string.
     * @param str The input string
     * @return An array where the first element is the number of vowels and the second element is the number of consonants
     */
    public static int[] countVowelsAndConsonants(String str) {
        int vowels = 0;
        int consonants = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        return new int[]{vowels, consonants};
    }
}