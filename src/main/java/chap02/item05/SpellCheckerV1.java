package chap02.item05;

import java.util.ArrayList;
import java.util.List;

/**
 * 정적 유틸리티를 잘못 사용한 예 - 유연하지 않고 테스트하기 어렵다.
 */
public class SpellCheckerV1 {
    private static final Lexicon dictionary = new CambridgeDictionary();

    private SpellCheckerV1() {}

    public boolean isValid(String word) {
        return false;
    }

    public List<String> suggestions(String typo) {
        return new ArrayList<>();
    }
}
