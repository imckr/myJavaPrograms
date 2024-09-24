import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * TextAnalyzer class to analyze the frequency of words in a given paragraph.
 */
public class TextAnalyzer {

    /**
     * Analyzes the frequency of each word in the given paragraph.
     * 
     * @param paragraph The paragraph to analyze.
     * @return A map containing words and their frequency.
     */
    public Map<String, Integer> analyzeText(String paragraph) {
        Map<String, Integer> wordFrequency = new HashMap<>();
        StringTokenizer tokenizer = new StringTokenizer(paragraph, " .,;:!?()[]{}\"'");

        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken().toLowerCase();
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        return wordFrequency;
    }

    /**
     * Finds the most frequent word in the given word frequency map.
     * 
     * @param wordFrequency The map containing words and their frequency.
     * @return The most frequent word.
     */
    public String findMostFrequentWord(Map<String, Integer> wordFrequency) {
        String mostFrequentWord = null;
        int maxFrequency = 0;

        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostFrequentWord = entry.getKey();
            }
        }

        return mostFrequentWord;
    }

    public static void main(String[] args) {
        TextAnalyzer analyzer = new TextAnalyzer();
        String paragraph = "This is a sample paragraph. This paragraph is for testing the text analyzer. The text analyzer should find the most frequent word.";

        Map<String, Integer> wordFrequency = analyzer.analyzeText(paragraph);
        String mostFrequentWord = analyzer.findMostFrequentWord(wordFrequency);

        System.out.println("Word Frequency: " + wordFrequency);
        System.out.println("Most Frequent Word: " + mostFrequentWord);
    }
}