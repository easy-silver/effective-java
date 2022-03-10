package chap02.item02;

import org.junit.jupiter.api.Test;

class NutritionFactsTest {

    @Test
    void builder_test () {
        NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8)
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .build();
    }

}