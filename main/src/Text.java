import java.util.ArrayList;
import java.util.List;

public class Text {
    private List<Sentence> sentences;

    // Constructor to parse text into sentences
    public Text(String text) {
        sentences = new ArrayList<>();
        String[] splitSentences = text.split("(?<=[.!?])\\s+");

        for (String sentence : splitSentences) {
            sentences.add(new Sentence(sentence));
        }
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Sentence sentence : sentences) {
            builder.append(sentence).append(" ");
        }
        return builder.toString().trim();
    }
}
