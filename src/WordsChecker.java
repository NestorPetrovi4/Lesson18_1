import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    protected Set<String> words = new HashSet<>();

    public WordsChecker(String text) {
        for (String word : text.split("\\P{IsAlphabetic}+")) {
            words.add(word);
        }
    }

    public boolean hasWord(String word) {
        return words.contains(word);
    }
}
