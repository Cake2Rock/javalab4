import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private List<Word> words;
    private char punctuation;

    public Sentence(String sentence) {
        words = new ArrayList<>();
        String[] parts = sentence.split("\\s+");
        punctuation = sentence.charAt(sentence.length() - 1);

        for (int i = 0; i < parts.length; i++) {
            if (i == parts.length - 1 && isPunctuation(parts[i])) {
                punctuation = parts[i].charAt(0);
            } else {
                words.add(new Word(parts[i]));
            }
        }
    }

    private boolean isPunctuation(String part) {
        return part.matches("[.!?]");
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
        for (Word word : words) {
            builder.append(word).append(" ");
        }
        builder.append(punctuation);
        return builder.toString().trim();
    }
}
