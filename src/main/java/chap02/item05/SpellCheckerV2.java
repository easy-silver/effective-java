package chap02.item05;

import java.util.ArrayList;
import java.util.List;

/**
 * 싱글턴을 잘못 사용한 예 - 유연하지 않고 테스트하기 어렵다.
 */
public class SpellCheckerV2 {
    private final Lexicon dictionary = new CambridgeDictionary();

    private SpellCheckerV2() {}
    public static SpellCheckerV2 INSTANCE = new SpellCheckerV2();

    public boolean isValid(String word) {
        return false;
    }

    public List<String> suggestions(String typo) {
        return new ArrayList<>();
    }
}
