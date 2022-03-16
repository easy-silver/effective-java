package chap02.item05;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 의존 객체 주입은 유연성과 테스트 용이성을 높여준다.
 */
public class SpellCheckerV3 {
    private final Lexicon dictionary;

    public SpellCheckerV3(Lexicon dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }

    public boolean isValid(String word) {
        return false;
    }

    public List<String> suggestions(String typo) {
        return new ArrayList<>();
    }
}
