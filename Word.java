import java.util.ArrayList;
import java.util.List;

public class Word {
    private List<Letter> letters;

    public Word(String word) {
        letters = new ArrayList<>();
        for (char c : word.toCharArray()) {
            letters.add(new Letter(c));
        }
    }

    public List<Letter> getLetters() {
        return letters;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Letter letter : letters) {
            builder.append(letter);
        }
        return builder.toString();
    }
}
