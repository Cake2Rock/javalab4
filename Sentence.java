import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private List<Word> words;
    private char punctuation;

    // Constructor to parse a sentence into words and punctuation
    public Sentence(String sentence) {
        words = new ArrayList<>();
        sentence = sentence.trim();
        punctuation = extractPunctuation(sentence);

        // Split sentence into words and remove punctuation
        String[] parts = sentence.replaceAll("[.!?]", "").split("\\s+");
        for (String part : parts) {
            if (!part.isEmpty()) {
                words.add(new Word(part));
            }
        }
    }

    // Extract punctuation mark from the end of the sentence
    private char extractPunctuation(String sentence) {
        if (sentence.endsWith(".") || sentence.endsWith("!") || sentence.endsWith("?")) {
            return sentence.charAt(sentence.length() - 1);
        }
        return ' '; // No punctuation
    }

    public List<Word> getWords() {
        return words;
    }

    public char getPunctuation() {
        return punctuation;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < words.size(); i++) {
            builder.append(words.get(i));
            if (i < words.size() - 1) {
                builder.append(" "); // Add space between words
            }
        }
        if (punctuation != ' ') {
            builder.append(punctuation); // Add punctuation mark at the end
        }
        return builder.toString().trim();
    }
}
